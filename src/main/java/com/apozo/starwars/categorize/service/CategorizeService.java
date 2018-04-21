package com.apozo.starwars.categorize.service;

import com.apozo.starwars.categorize.payload.People;
import com.apozo.starwars.categorize.webclient.AppStarWarsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CategorizeService {

    @Autowired
    private AppStarWarsClient starWarsClient;

    public Flux<String> getPeopleFromStarWarsWorld() {
        Flux<People> peopleFlux = starWarsClient.listPeopleFromStarWars();
        Flux<String> resultMap = peopleFlux.map(people -> people != null ? "Starting to publish..." : "Consume from Star Wars Api Failed ");

        return resultMap;
    }
}
