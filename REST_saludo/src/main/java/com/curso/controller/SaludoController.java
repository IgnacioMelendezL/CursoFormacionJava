package com.curso.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

	@GetMapping(value = "saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola, mundo";
	}

	@GetMapping(value = "saludo/{x}/{y}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo(@PathVariable("x") String x, @PathVariable("y") String y) {
		return "x: " + x + "\ny: " + y;
	}
}
