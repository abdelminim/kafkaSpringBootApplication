package com.amigous.kafkaProject.kafkaSpringBootApplication.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(id = "groupId", topics = "kafkaTopicOne", clientIdPrefix = "myClientId")
    public void listen(String data) {
        System.out.println("listening on " + data + "..." + System.currentTimeMillis());
    }

}
