package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	LibrosService libros;
//	LibrosService libros = new LibrosServiceImpl();

	@GetMapping(value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> getLibros() {
		return libros.libros();
	}

	@GetMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro getLibro(@PathVariable("isbn") String isbn) {
		return libros.buscarLibro(isbn);
	}

	@PostMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void postLibro(@RequestBody Libro libro) {
		libros.insertarLibro(libro);
	}

	@PutMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void putLibro(@RequestBody Libro libro) {
		libros.modificarLibro(libro);
	}

	@DeleteMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> deleteLibro(@PathVariable("isbn") String isbn) {
		return libros.eliminarLibro(isbn);
	}
}