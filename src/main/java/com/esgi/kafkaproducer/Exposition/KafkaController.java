package com.esgi.kafkaproducer.Exposition;

import com.esgi.kafkaproducer.application.SendMessageService;
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
    public void messageJsonToTopic(@RequestBody Subscriber subscriber) {

        sendMessageService.sendJsonMessage(subscriber);
    }
}

