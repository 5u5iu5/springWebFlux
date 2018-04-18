package com.adelpozo.spring.configuration;

import com.adelpozo.spring.handlers.AppHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.*;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.path;

@Configuration
public class WebRouter {

    @Bean
    public RouterFunction<ServerResponse> route(AppHandler appHandler) {

        return RouterFunctions
                .route(POST("/start").and(accept(MediaType.APPLICATION_JSON)), appHandler::startToConsume);
    }
}
