package com.adelpozo.spring.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class AppHandler {

    private final Logger log =LoggerFactory.getLogger(this.getClass());

	public Mono<ServerResponse> startToConsume(ServerRequest request) {

		//TODO: Start to consume from any API rest
        log.info("Start to consume from any API rest");

		return ServerResponse.accepted().contentType(MediaType.TEXT_PLAIN)
			.body(BodyInserters.fromObject("Starting to consume!"));
	}

}
