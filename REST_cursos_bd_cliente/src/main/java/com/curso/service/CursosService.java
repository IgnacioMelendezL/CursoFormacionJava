package com.curso.service;

import java.util.List;

import com.curso.model.Formacion;

public interface CursosService {

	List<Formacion> mostrarFormaciones();

	void altaCurso(Formacion formacion);

}
