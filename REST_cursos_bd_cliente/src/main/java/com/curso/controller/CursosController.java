package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Formacion;
import com.curso.service.CursosService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class CursosController {

	@Autowired
	CursosService cursos;

	@ApiOperation(value = "Devuelve todas las formaciones")
	@GetMapping(value = "formaciones")
	public List<Formacion> mostrarFormaciones() {
		return cursos.mostrarFormaciones();
	}

	@ApiOperation(value = "Crea una formación nueva recibida por el cuerpo")
	@PostMapping(value = "formacion", consumes= MediaType.APPLICATION_JSON_VALUE)
	public void altaCurso(@ApiParam(value = "Objeto formación recibido por el cuerpo") @RequestBody Formacion formacion) {
		cursos.altaCurso(formacion);
	}
}