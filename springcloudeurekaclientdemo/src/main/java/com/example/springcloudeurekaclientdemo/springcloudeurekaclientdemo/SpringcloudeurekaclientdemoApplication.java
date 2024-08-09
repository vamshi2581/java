package com.example.springcloudeurekaclientdemo.springcloudeurekaclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudeurekaclientdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekaclientdemoApplication.class, args);
	}

}
