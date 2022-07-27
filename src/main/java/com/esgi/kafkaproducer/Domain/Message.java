package com.esgi.kafkaproducer.Domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Message {
    @Id
    private String Id;

    private String name;



}
