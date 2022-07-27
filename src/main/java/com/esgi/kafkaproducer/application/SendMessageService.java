package com.esgi.kafkaproducer.application;

import com.esgi.kafkaproducer.Exposition.Subscriber;
import com.esgi.kafkaproducer.utils.JsonProducer;
import com.esgi.kafkaproducer.utils.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service

public class SendMessageService {


    private final Producer producer;
    private final JsonProducer jsonProducer;



    @Autowired
    public SendMessageService(Producer producer, JsonProducer jsonProducer) {
        this.producer = producer;
        this.jsonProducer = jsonProducer;
    }

    public void sendMessage(String message) {

        this.producer.sendMessage(message);


    }
    public void sendJsonMessage(Subscriber subscriber) {


        this.jsonProducer.sendMessage(subscriber);


    }


}