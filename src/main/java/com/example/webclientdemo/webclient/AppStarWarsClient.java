package com.example.webclientdemo.webclient;

import com.example.webclientdemo.config.ApplicationConfig;
import com.example.webclientdemo.payload.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

/**
 * Created by rajeevkumarsingh on 10/11/17.
 */

@Service
public class AppStarWarsClient {

    private static final Logger logger = LoggerFactory.getLogger(AppStarWarsClient.class);

    private final WebClient webClient;

    @Autowired
    public AppStarWarsClient(ApplicationConfig appProperties) {
        this.webClient = WebClient
                .builder()
                .baseUrl("https://swapi.co")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .filter(logRequest())
                .build();
    }


    public Flux<People> listPeopleFromStarWars() {
         return webClient.get()
                .uri("/api/people/")
                .exchange()
                .flatMapMany(clientResponse -> clientResponse.bodyToFlux(People.class));
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
