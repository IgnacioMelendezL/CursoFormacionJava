package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Ejemplar;
import com.curso.service.EjemplaresService;

@RestController
public class EjemplaresController {
	
	@Autowired
	EjemplaresService service;

	@GetMapping(value = "ejemplares")
	public List<Object> getLibros() {
		return service.ejemplares();
	}
	
	@PostMapping(value="ejemplar/{isbn}/{titulo}/{tematica}")
	public List<Ejemplar> altaEjemplar(@PathVariable("isbn") int isbn, 
									   @PathVariable("titulo") String titulo, 
									   @PathVariable("tematica") String tematica){
		Ejemplar ejemplar = new Ejemplar(isbn, titulo, tematica);
		return service.nuevoEjemplar(ejemplar);
	}
}