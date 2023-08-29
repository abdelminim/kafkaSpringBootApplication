package com.amigous.kafkaProject.kafkaSpringBootApplication.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {
    @Bean
    public NewTopic kRequests() {
        return TopicBuilder.name("amigosCodeTopic")
                .partitions(10)
                .replicas(2)
                .build();
    }
}
