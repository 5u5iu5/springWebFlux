package com.apozo.starwars.categorize.service;

import com.apozo.starwars.categorize.kafka.KafkaPublisher;
import com.apozo.starwars.categorize.payload.ListPeople;
import com.apozo.starwars.categorize.payload.People;
import com.apozo.starwars.categorize.webclient.AppStarWarsClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.json.jackson.JacksonFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.io.IOException;

@Service
public class CategorizeService {

    @Autowired
    private AppStarWarsClient starWarsClient;

    @Autowired
    private KafkaPublisher kafkaPublisher;

    public Flux<ListPeople> getPeopleFromStarWarsWorld() {
        Flux<ListPeople> peopleFlux = starWarsClient.listPeopleFromStarWars();
        Flux<ListPeople> stringFlux = peopleFlux.doOnNext(p -> categorizeAndSendToKafka(p));

        return stringFlux;
    }

//    private ListPeople stringToPojo(String peopleFromString) {
//        ObjectMapper mapper = new ObjectMapper();
//        ListPeople people = null;
//        try {
//            people = mapper.readValue(peopleFromString, ListPeople.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return people;
//    }

    private String categorizeAndSendToKafka(ListPeople p) {
        if (p != null) {
            try {
                kafkaPublisher.publish("mierda", "jedis");
                return "Kafka Published";
            } catch (InterruptedException e) {
                e.printStackTrace();
                return "InterruptedExepction publishing in kafka";
            }
        } else
            return "No data";
    }
}
