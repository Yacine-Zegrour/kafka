package com.esgi.kafkaproducer.Exposition;

import com.esgi.kafkaproducer.application.SendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}

