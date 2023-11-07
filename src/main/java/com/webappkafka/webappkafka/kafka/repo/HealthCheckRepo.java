package com.webappkafka.webappkafka.kafka.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webappkafka.webappkafka.kafka.entity.HealthCheck;

@Repository
public interface HealthCheckRepo extends JpaRepository<HealthCheck, String> {

}
