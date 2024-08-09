package com.org.springcloudconfiguration.cloudconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudconfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudconfigurationApplication.class, args);
	}

}
