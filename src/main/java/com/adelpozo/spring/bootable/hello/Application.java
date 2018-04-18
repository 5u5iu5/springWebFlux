package com.adelpozo.spring.bootable.hello;

import com.adelpozo.spring.configuration.AppStarWarsWebClient;
import com.adelpozo.spring.configuration.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.adelpozo.spring")
public class Application {

    @Autowired
    private ApplicationConfig appConfig;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run();
	}

    public void run(String... args) throws Exception {
        AppStarWarsWebClient gwc = new AppStarWarsWebClient(appConfig);
        System.out.println(gwc.getResult());
    }


}
