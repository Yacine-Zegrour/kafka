package com.esgi.kafkaproducer.Exposition;

import com.esgi.kafkaproducer.application.SendMessageService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class KafkaController {

    private SendMessageService sendMessageService;

    @Autowired
    public KafkaController(SendMessageService sendMessageService) {
        this.sendMessageService = sendMessageService;
    }


    @PostMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message) {

        sendMessageService.sendMessage(message);
    }

    @PostMapping("/publishJson")
    public void messageJsonToTopic(@RequestBody Subscriber subscriber) throws JsonProcessingException {

        sendMessageService.sendJsonMessage(subscriber);
    }
}

