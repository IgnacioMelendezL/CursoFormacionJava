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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class CursosController {

	@Autowired
	CursosService cursos;

	@ApiOperation(value = "Crea un curso nuevo recibido por el cuerpo")
	@PostMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> postCurso(@ApiParam(value = "Objeto curso recibido por el cuerpo") @RequestBody Curso curso) {
		return cursos.altaCurso(curso);
	}

	@ApiOperation(value = "Elimina un curso según su código")
	@DeleteMapping(value = "curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> deleteCurso(@ApiParam(value = "Código del curso") @PathVariable("codCurso") int codCurso) {
		return cursos.eliminarCurso(codCurso);
	}

	@ApiOperation(value = "Actualiza la duración de un curso según su código")
	@PutMapping(value = "curso/{codCurso}/{duracion}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void putCurso(@ApiParam(value = "Código del curso") @PathVariable("codCurso") int codCurso, 
						@ApiParam(value = "Duración del curso") @PathVariable("duracion") int duracion) {
		cursos.modificarDuracion(codCurso, duracion);
	}

	@ApiOperation(value = "Devuelve un curso según su código")
	@GetMapping(value = "curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso getCurso(@ApiParam(value = "Código del curso") @PathVariable("codCurso") int codCurso) {
		return cursos.buscarCurso(codCurso);
	}

	@ApiOperation(value = "Devuelve todos los cursos cuya duración esté en el rango [min, max]")
	@GetMapping(value = "curso/{min}/{max}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> getCurso(@ApiParam(value = "Duración mínima") @PathVariable("min") int min, 
							@ApiParam(value = "Duración máxima") @PathVariable("max") int max) {
		return cursos.rangoPrecio(min, max);
	}

	@ApiOperation(value = "Devuelve todos los cursos")
	@GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> getCurso() {
		return cursos.cursos();
	}

}
