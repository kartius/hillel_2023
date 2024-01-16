package org.hillel.service_filtering.service;

import org.example.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import static org.springframework.http.MediaType.APPLICATION_NDJSON;


@Service
public class MessageService {

    @Autowired
    private WebClient webClient;

    public Flux<String> createMessage() {
        return webClient.get().uri("/messages")
                .accept(APPLICATION_NDJSON)
                .retrieve()
                .bodyToFlux(String.class)
                .delayElements(Duration.of(5, ChronoUnit.SECONDS))
                .filter(m -> m.contains("2"))
                .map(m -> m + " filtered");
    }

}
