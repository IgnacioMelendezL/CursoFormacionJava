package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.modelo.Ejemplar;
import com.curso.service.EjemplaresService;

@RestController
public class EjemplaresController {
	@Autowired
	EjemplaresService service;

	@PostMapping(value="ejemplar/{isbn}/{titulo}/{tematica}")
	public List<Ejemplar> altaEjemplar(@PathVariable("isbn") int isbn, @PathVariable("titulo") String titulo, @PathVariable("tematica") String tematica) {
		return service.nuevoEjemplar(new Ejemplar(isbn, titulo, tematica));
	}
}