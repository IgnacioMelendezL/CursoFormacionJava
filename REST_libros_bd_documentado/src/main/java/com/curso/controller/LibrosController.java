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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class LibrosController {

	@Autowired
	LibrosService libros;

	@ApiOperation(value = "Devuelve todos los libros")
	@GetMapping(value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> getLibros() {
		return libros.libros();
	}

	@ApiOperation(value = "Devuelve un libro según su ISBN")
	@GetMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro getLibro(@ApiParam(value = "ISBN del libro a buscar") @PathVariable("isbn") int isbn) {
		return libros.buscarLibro(isbn);
	}

	@ApiOperation(value = "Crea un libro nuevo con los datos recibidos en el cuerpo")
	@PostMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void postLibro(@ApiParam(value = "Objeto libro con los datos del cuerpo") @RequestBody Libro libro) {
		libros.insertarLibro(libro);
	}

	@ApiOperation(value = "Actualiza un libro con los datos recibidos en el cuerpo")
	@PutMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void putLibro(@ApiParam(value = "Objeto libro con los datos del cuerpo") @RequestBody Libro libro) {
		libros.modificarLibro(libro);
	}

	@ApiOperation(value = "Elimina un libro según su ISBN")
	@DeleteMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteLibro(@ApiParam(value = "ISBN del libro a eliminar") @PathVariable("isbn") int isbn) {
		libros.eliminarLibro(isbn);
	}
}
