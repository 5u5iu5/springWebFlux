package com.adelpozo.spring.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class ApplicationConfig {

    private String starwars_endpoint;
    private String starwars_uri;

    public String getStarwars_endpoint() {
        return starwars_endpoint;
    }

    public void setStarwars_endpoint(String starwars_endpoint) {
        this.starwars_endpoint = starwars_endpoint;
    }

    public String getStarwars_uri() {
        return starwars_uri;
    }

    public void setStarwars_uri(String starwars_uri) {
        this.starwars_uri = starwars_uri;
    }
}
