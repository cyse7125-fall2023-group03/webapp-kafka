package com.webappkafka.webappkafka.kafka;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

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
        healthCheck.setCheck_created(OffsetDateTime.now(ZoneOffset.UTC).toString());
        healthCheck.setCheck_updated(OffsetDateTime.now(ZoneOffset.UTC).toString());
        healthCheckRepo.save(healthCheck);
    }
}
