package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = { "com.curso.controller", "com.curso.service" })
public class RestLibrosBdClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestLibrosBdClienteApplication.class, args);
	}

	@LoadBalanced
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}