package org.hillel.message_service.controller;

import org.example.model.Message;
import org.hillel.message_service.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/messages")
    public Flux<String> getMessages() {
        return messageService.createMessage();
    }
}
