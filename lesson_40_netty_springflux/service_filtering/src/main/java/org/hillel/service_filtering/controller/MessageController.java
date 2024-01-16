package org.hillel.service_filtering.controller;

import org.example.model.Message;
import org.hillel.service_filtering.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

import static java.util.stream.Collectors.toList;


@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/messages")
    public Mono<List<String>> getMessages() {
        return messageService.createMessage().collect(toList());
    }
}
