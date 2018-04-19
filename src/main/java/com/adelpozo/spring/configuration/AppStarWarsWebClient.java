package com.adelpozo.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class AppStarWarsWebClient {

    @Autowired
    private ApplicationConfig appConfig;

    public String getResult() {
        WebClient client = WebClient.create(appConfig.getUri());
        Mono<ClientResponse> result = getClientResponseMono(client);
        return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class));
    }

    private Mono<ClientResponse> getClientResponseMono(WebClient client) {
        return client.get()
                .uri(appConfig.getEndpoint())
                .accept(MediaType.APPLICATION_JSON)
                .exchange();
    }
}
