package com.example.restclient;

import com.example.restclient.service.RestClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestClientApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(RestClientApplication.class, args);
        final RestClient restClient = run.getBean(RestClient.class);
        restClient.callMethod();
    }
}
