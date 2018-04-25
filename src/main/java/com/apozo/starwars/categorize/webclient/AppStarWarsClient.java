package com.apozo.starwars.categorize.webclient;

import com.apozo.starwars.categorize.config.ApplicationConfig;
import com.apozo.starwars.categorize.payload.ListPeople;
import com.apozo.starwars.categorize.payload.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajeevkumarsingh on 10/11/17.
 */

@Service
public class AppStarWarsClient {

    private static final Logger logger = LoggerFactory.getLogger(AppStarWarsClient.class);

    private final WebClient webClient;

    private String people;

    private ApplicationConfig appProperties;

    @Autowired
    public AppStarWarsClient(ApplicationConfig appProperties) {
        this.appProperties = appProperties;
        this.webClient = WebClient
                .builder()
                .baseUrl(this.appProperties.getUri())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .filter(logRequest())
                .build();
    }


    private Flux<ListPeople> listPeopleFromStarWars(final String page) {
        return webClient.get()
                .uri(appProperties.getEndpoint())
                .exchange()
                .flatMapMany(clientResponse -> clientResponse.bodyToFlux(ListPeople.class));
    }

    public Flux<ListPeople> listPeopleFromStarWars() {
        Flux<ListPeople> listPeopleFlux = listPeopleFromStarWars("");
        Flux<ListPeople> listPeopleFlux1 = listPeopleFlux.flatMap(i -> webClient.get()
                .uri("/api/people/?page={page}", i.getNext().toString().split("\\?")[1].replace("page=", ""))
                .retrieve()
                .bodyToMono(ListPeople.class), 1);


        return listPeopleFlux1;
    }


    private ExchangeFilterFunction logRequest() {
        return (clientRequest, next) -> {
            logger.info("Request: {} {}", clientRequest.method(), clientRequest.url());
            clientRequest.headers()
                    .forEach((name, values) -> values.forEach(value -> logger.info("{}={}", name, value)));
            return next.exchange(clientRequest);
        };
    }
}
