package com.apozo.starwars.categorize.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "starwars")
public class ApplicationConfig {

    private String uri;

    private String endpoint;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public String toString() {
        return "ApplicationConfig{" +
                "uri='" + uri + '\'' +
                ", endpoint='" + endpoint + '\'' +
                '}';
    }
}
