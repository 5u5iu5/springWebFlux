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
import java.util.Objects;
import java.util.stream.IntStream;

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

    public Flux<ListPeople> listPeopleFromStarWars() {
        Flux<ListPeople> listPeopleFlux = Flux.fromStream(IntStream.iterate(0, i -> i + 1)
                .boxed())
                .flatMap(i -> webClient.get()
                        .uri(i == 0 ? appProperties.getEndpoint() : appProperties.getEndpoint() + "?page={page}", i)
                        .retrieve()
                        .bodyToMono(ListPeople.class), 1)
                .takeUntil(l -> l.getNext() == null);
        //.flatMapIterable(ListPeople::getResults);


        return listPeopleFlux;
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
