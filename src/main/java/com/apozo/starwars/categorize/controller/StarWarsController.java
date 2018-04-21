package com.apozo.starwars.categorize.controller;

import com.apozo.starwars.categorize.service.CategorizeService;
import com.apozo.starwars.categorize.webclient.AppStarWarsClient;
import com.apozo.starwars.categorize.payload.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class StarWarsController {

    @Autowired
    private CategorizeService service;

    private static final Logger logger = LoggerFactory.getLogger(StarWarsController.class);

    @GetMapping("/start")
    public Flux<String> start() {
        return service.getPeopleFromStarWarsWorld();
    }

    @ExceptionHandler(WebClientResponseException.class)
    public ResponseEntity<String> handleWebClientResponseException(WebClientResponseException ex) {
        logger.error("Error from WebClient - Status {}, Body {}", ex.getRawStatusCode(),
                ex.getResponseBodyAsString(), ex);
        return ResponseEntity.status(ex.getRawStatusCode()).body(ex.getResponseBodyAsString());
    }
}
