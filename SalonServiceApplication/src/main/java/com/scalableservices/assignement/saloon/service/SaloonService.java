package com.scalableservices.assignement.saloon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SaloonService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendSaloonEvent(String event) {
        kafkaTemplate.send("saloon-events", event);
    }
}

