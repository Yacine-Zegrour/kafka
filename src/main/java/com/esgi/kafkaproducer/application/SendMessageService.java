package com.esgi.kafkaproducer.application;

import com.esgi.kafkaproducer.utils.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SendMessageService {


    private final Producer producer;



    @Autowired
    public SendMessageService(Producer producer) {
        this.producer = producer;
    }

    public void sendMessage(String message) {

        this.producer.sendMessage(message);


    }
}