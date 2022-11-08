package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.curso.controller", "com.curso.service"})
public class RestCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCursosApplication.class, args);
	}

}
