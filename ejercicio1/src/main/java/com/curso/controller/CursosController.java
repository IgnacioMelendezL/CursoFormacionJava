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
import com.curso.service.CursosService;

@RestController
public class CursosController {
	@Autowired
	CursosService service;

	@PostMapping(value = "altacurso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> altaCurso(@RequestBody Curso curso) {
		return service.altaCurso(curso);
	}

	@DeleteMapping(value = "cursos/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> eliminarCurso(@PathVariable ("codCurso") int codCurso) {
		return service.eliminarCurso(codCurso);
	}

	@PutMapping(value = "curso/{horas}/{codCurso}")
	public void actualizarDuracionCurso(@PathVariable ("horas") int horas, @PathVariable ("codCurso") int codCurso) {
		service.actualizarDuracionCurso(horas, codCurso);
	}
		 

	@GetMapping(value = "curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarCurso(@PathVariable ("codCurso") int codCurso) {
		return service.buscarCurso(codCurso);
	}

	@GetMapping(value = "cursos/{min}/{max}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> porPrecioCurso(@PathVariable ("min") int min,@PathVariable ("max")  int max) {
		return service.porPrecioCurso(min, max);
	}
}
