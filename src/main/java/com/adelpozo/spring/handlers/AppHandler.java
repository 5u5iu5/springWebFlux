package com.adelpozo.spring.handlers;

import com.adelpozo.spring.configuration.AppStarWarsWebClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class AppHandler {

    @Autowired
    private AppStarWarsWebClient client;

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public Mono<ServerResponse> startToConsume(ServerRequest request) {

        log.info("Start to consume from any API rest");

        //TODO: Start to consume from any API rest
        log.info(client.getPeopleFromStarWars());

        return ServerResponse.accepted().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Starting to consume!"));
    }

}
