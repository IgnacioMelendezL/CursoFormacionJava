package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursosService {
	
	List<Curso> cursos(); //BORRAR

	List<Curso> altaCurso(Curso curso);
	List<Curso> eliminarCurso(int codCurso);
	void actualizarDuracionCurso(int numHoras, int codCurso);
	Curso buscarCurso(int codCurso);
	List<Curso> porPrecioCurso(double min,double max);
}
