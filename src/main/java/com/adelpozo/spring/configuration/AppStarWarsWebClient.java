package com.adelpozo.spring.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
public class AppStarWarsWebClient {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final WebClient webClient;
    private ApplicationConfig appConfig;

    @Autowired
    public AppStarWarsWebClient(ApplicationConfig appConfig) {
        this.appConfig = appConfig;
        this.webClient = WebClient
                .builder()
                .baseUrl(appConfig.getUri())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .filter(logRequest())
                .build();
    }

    public Flux<String> getPeopleFromStarWars() {
        Flux<String> stringFlux = webClient.get()
                .uri(appConfig.getEndpoint(),
                        "updated", "desc")
                .exchange()
                .flatMapMany(clientResponse -> clientResponse.bodyToFlux(String.class));

        return "RESULT -> " + stringFlux.flatMap(result -> result.toString());
    }

    private ExchangeFilterFunction logRequest() {
        return (clientRequest, next) -> {
            log.info("Request: {} {}", clientRequest.method(), clientRequest.url());
            clientRequest.headers()
                    .forEach((name, values) -> values.forEach(value -> log.info("{}={}", name, value)));
            return next.exchange(clientRequest);
        };
    }
}
