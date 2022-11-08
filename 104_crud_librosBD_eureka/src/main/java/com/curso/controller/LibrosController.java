package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Libro;
import com.curso.service.LibrosService;

@RestController
public class LibrosController {
	@Value("${eureka.instance.instance-id}")
	String instancia;

	@Autowired
	LibrosService service;

	@GetMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro buscarLibro(@PathVariable("isbn") int isbn) {
		return service.buscarLibro(isbn);
	}

	@GetMapping(value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> libros() {
		System.out.println(instancia);
		return service.libros();
	}

	@PostMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
	void agregar(@RequestBody Libro libro) {
		service.altaLibro(libro);
	}

	@PutMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
	void actualizarLibro(@RequestBody Libro libro) {
		service.actualizarLibro(libro);
	}

	@DeleteMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	void eliminarLibro(@PathVariable("isbn") int isbn) {
		service.eliminarLibro(isbn);
	}
}
