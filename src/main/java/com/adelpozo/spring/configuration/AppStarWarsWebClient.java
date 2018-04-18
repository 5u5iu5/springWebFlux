package com.adelpozo.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


public class AppStarWarsWebClient {

    ApplicationConfig appConfig;

    public AppStarWarsWebClient(ApplicationConfig appConfig) {
        this.appConfig = appConfig;
    }

    public String getResult() {
        WebClient client = WebClient.create(appConfig.getStarwars_uri());
        Mono<ClientResponse> result = getClientResponseMono(client);
        return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
    }

    private Mono<ClientResponse> getClientResponseMono(WebClient client) {
        return client.get()
                .uri(appConfig.getStarwars_endpoint())
                .accept(MediaType.APPLICATION_JSON)
                .exchange();
    }
}
