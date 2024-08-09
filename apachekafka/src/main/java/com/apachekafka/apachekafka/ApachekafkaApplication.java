package com.apachekafka.apachekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ApachekafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApachekafkaApplication.class, args);
	}

}
