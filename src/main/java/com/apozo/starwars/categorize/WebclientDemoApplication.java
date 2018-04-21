package com.apozo.starwars.categorize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.apozo.starwars.categorize")
public class WebclientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebclientDemoApplication.class, args);
	}
}
