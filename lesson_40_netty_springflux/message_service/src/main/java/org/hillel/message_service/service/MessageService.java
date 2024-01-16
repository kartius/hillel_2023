package org.hillel.message_service.service;

import org.example.model.Message;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {


    public Flux<String> createMessage() {
        List<String> messages = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            messages.add("message " + i);
        }
        return Flux.fromStream(messages.stream());
    }

}
