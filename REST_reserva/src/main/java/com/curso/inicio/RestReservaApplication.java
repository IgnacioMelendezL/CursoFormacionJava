package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EntityScan(basePackages="com.curso.model")
@EnableJpaRepositories(basePackages= {"com.curso.dao"})
@SpringBootApplication(scanBasePackages={"com.curso.controller","com.curso.service"})
public class RestReservaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestReservaApplication.class, args);
	}

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}

}
