package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.curso.dao" })
@EntityScan(basePackages = { "com.curso.model" })
@SpringBootApplication(scanBasePackages = { "com.curso.controller", "com.curso.service" })
public class RestHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestHotelApplication.class, args);
	}

}
