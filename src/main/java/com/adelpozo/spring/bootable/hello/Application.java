package com.adelpozo.spring.bootable.hello;

import com.adelpozo.spring.configuration.AppStarWarsWebClient;
import com.adelpozo.spring.configuration.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.adelpozo.spring")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);

        AppStarWarsWebClient gwc = new AppStarWarsWebClient();
        System.out.println(gwc.getResult());
    }

}
