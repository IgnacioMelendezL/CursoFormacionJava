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

import com.curso.model.Curso;
import com.curso.service.CursosServiceImpl;

@RestController
public class CursosController {
	@Autowired
	CursosServiceImpl cursos = new CursosServiceImpl();

	@PostMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> postLibro(@RequestBody Curso libro) {
		return cursos.altaCurso(libro);
	}

	@DeleteMapping(value = "curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> deleteLibro(@PathVariable("codCurso") int codCurso) {
		return cursos.eliminarCurso(codCurso);
	}

	@PutMapping(value = "curso/{codCurso}/{duracion}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void putLibro(@PathVariable("codCurso") int codCurso, @PathVariable("duracion") int duracion) {
		cursos.modificarDuracion(codCurso, duracion);
	}

	@GetMapping(value = "curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso getLibro(@PathVariable("codCurso") int codCurso) {
		return cursos.buscarCurso(codCurso);
	}

	@GetMapping(value = "curso/{min}/{max}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> getLibro(@PathVariable("min") int min, @PathVariable("max") int max) {
		return cursos.rangoPrecio(min, max);
	}

}
