# Consume From STAR WARS api REST and publish to kafka using Spring 5's Reactive WebClient and WebTestClient.

## Star Wars API
https://swapi.co

We only need to consume data from Star Wars characters. This is the endpoint __/api/people__

The people data is processed and categorized by alignment. (jedis and siths) and after that it be published to Kafka.

## Kafka
Actually, I are using my docker compose for up kafkaserver from https://github.com/5u5iu5/akkaStreamCamelPocWithBackpressure/blob/master/docker/docker-compose.yml

