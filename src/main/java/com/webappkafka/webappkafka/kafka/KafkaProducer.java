package com.webappkafka.webappkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.webappkafka.webappkafka.kafka.entity.HealthCheck;

@Service
public class KafkaProducer {

	@Value("${spring.kafka.topic.name}")
	private String topicName;

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

	private KafkaTemplate<String, HealthCheck> kafkaTemplate;

	public KafkaProducer(KafkaTemplate<String, HealthCheck> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(HealthCheck healthCheck) {

		LOGGER.info(String.format("Message sent -> %s", healthCheck.toString()));

		Message<HealthCheck> message = MessageBuilder.withPayload(healthCheck).setHeader(KafkaHeaders.TOPIC, topicName)
				.build();

		kafkaTemplate.send(message);
	}
}
