package com.webappkafka.webappkafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webappkafka.webappkafka.kafka.KafkaProducer;
import com.webappkafka.webappkafka.kafka.entity.HealthCheck;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

	private KafkaProducer kafkaProducer;

	public MessageController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

	@PostMapping("/publish")
	public ResponseEntity<?> publish(@RequestBody HealthCheck healthCheck) {
		kafkaProducer.sendMessage(healthCheck);
		return ResponseEntity.ok("Json message sent to kafka topic");
	}
}
