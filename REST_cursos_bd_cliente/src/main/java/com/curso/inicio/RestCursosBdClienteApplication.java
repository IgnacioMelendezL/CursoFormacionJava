package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = { "com.curso.controller", "com.curso.service", "com.curso.inicio" })
public class RestCursosBdClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCursosBdClienteApplication.class, args);
	}

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}