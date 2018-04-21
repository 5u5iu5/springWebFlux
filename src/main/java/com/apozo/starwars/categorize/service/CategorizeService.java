package com.apozo.starwars.categorize.service;

import com.apozo.starwars.categorize.kafka.KafkaPublisher;
import com.apozo.starwars.categorize.payload.People;
import com.apozo.starwars.categorize.webclient.AppStarWarsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CategorizeService {

    @Autowired
    private AppStarWarsClient starWarsClient;

    @Autowired
    private KafkaPublisher kafkaPublisher;

    public Flux<String> getPeopleFromStarWarsWorld() {
        Flux<People> peopleFlux = starWarsClient.listPeopleFromStarWars();
        Flux<String> resultMap = peopleFlux.map(people -> {
            try {
                if (people != null) {
                    kafkaPublisher.publish(people.getType(), "jedis");
                    return "Kafka publisher starting...";
                } else
                    return "No data to publish";
            } catch (InterruptedException e) {
               return "Several error from Kafka Publisher ";
            }
        });

        return resultMap;
    }
}
