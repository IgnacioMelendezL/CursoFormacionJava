package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.curso.controller"})
public class ThymeleafHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafHelloWorldApplication.class, args);
	}

}
