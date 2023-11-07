package com.webappkafka.webappkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.webappkafka.webappkafka.kafka.entity.HealthCheck;
import com.webappkafka.webappkafka.kafka.repo.HealthCheckRepo;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    
    @Autowired
    private HealthCheckRepo healthCheckRepo;

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(HealthCheck healthCheck){
        LOGGER.info(String.format("Json message recieved -> %s", healthCheck.toString()));
        healthCheckRepo.save(healthCheck);
    }
}
