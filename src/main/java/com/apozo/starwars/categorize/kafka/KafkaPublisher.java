package com.apozo.starwars.categorize.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Component
public class KafkaPublisher {

    private static Logger logger = LoggerFactory.getLogger(KafkaPublisher.class);

    @Autowired
    private KafkaTemplate<String, String> template;

    private final CountDownLatch latch = new CountDownLatch(3);

    public void publish(final String categorizeData, final String topic) throws InterruptedException {
        this.template.send(topic, categorizeData);
        latch.await(60, TimeUnit.SECONDS);
        logger.info("All received");
    }

}
