package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursosService {

	List<Curso> altaCurso(Curso curso);
	
	List<Curso> eliminarCurso(int codCurso);
	
	void modificarDuracion(int codCurso, int duracion);

	Curso buscarCurso(int codCurso);

	List<Curso> rangoPrecio(float min, float max);
	
	List<Curso> cursos();
	
}
