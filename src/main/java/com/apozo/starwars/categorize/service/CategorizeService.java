package com.apozo.starwars.categorize.service;

import com.apozo.starwars.categorize.kafka.KafkaPublisher;
import com.apozo.starwars.categorize.payload.ListPeople;
import com.apozo.starwars.categorize.payload.People;
import com.apozo.starwars.categorize.webclient.AppStarWarsClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.json.jackson.JacksonFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.io.IOException;

@Service
public class CategorizeService {

    private static final Logger logger = LoggerFactory.getLogger(CategorizeService.class);

    @Autowired
    private AppStarWarsClient starWarsClient;

    @Autowired
    private KafkaPublisher kafkaPublisher;

    public Flux<String> getPeopleFromStarWarsWorld() {
        Flux<ListPeople> peopleFlux = starWarsClient.listPeopleFromStarWars();
        Flux<String> map = peopleFlux.map(p -> categorizeAndSendToKafka(p));

        return map;
    }

    private String categorizeAndSendToKafka(ListPeople p) {
        if (p != null) {
            return categorizePeople(p);
        } else
            return "No data";
    }

    private String categorizePeople(ListPeople p) {
        p.getResults().stream().forEach(people -> {
            try {
                kafkaPublisher.publish(people.getName(), "people");
            } catch (InterruptedException e) {
                logger.error("Error trying to publish to kafka: " + e.getLocalizedMessage());
            }
        });

        return "Kafka Published";
    }
}
