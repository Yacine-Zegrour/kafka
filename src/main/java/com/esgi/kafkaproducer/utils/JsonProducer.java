package com.esgi.kafkaproducer.utils;

import com.esgi.kafkaproducer.Exposition.Subscriber;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import static org.springframework.kafka.support.KafkaHeaders.TOPIC;

@Service
public class JsonProducer {
    private static final String TOPIC = "test_topic";
    @Autowired
    private KafkaTemplate<String,Subscriber> kafkaTemplate;

    public void sendMessage(Subscriber subscriber){

        this.kafkaTemplate.send(TOPIC,subscriber);
    }


}
