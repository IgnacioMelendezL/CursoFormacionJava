package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Curso;

@Service
public class CursosServiceImpl implements CursosService {

	private List<Curso> cursos = new ArrayList<Curso>(
			List.of(new Curso(1, "Programación en Java", 100, 1f),
					new Curso(2, "Programación en C++", 200, 2f),
					new Curso(3, "Recetas Termomix", 300, 3f),
					new Curso(4, "El libro gordo de Petete", 400, 4f)));

	@Override
	public Curso buscarCurso(int codCurso) {
		Curso curso = null;

		for (Curso cur : cursos)
			if (cur.getCodCurso() == codCurso)
				curso = cur;

		return curso;
	}

	@Override
	public List<Curso> altaCurso(Curso curso) {
		cursos.add(curso);
		return cursos;
	}

	@Override
	public void modificarDuracion(int codCurso, int duracion) {
		Curso curso = null;

		for (Curso cur : cursos)
			if (cur.getCodCurso() == codCurso)
				curso = cur;
		
		if (curso != null) {
			int pos = cursos.indexOf(curso);
			if (pos >= 0) {
				curso.setDuracion(duracion);
				cursos.set(pos, curso);
			}
		}
	}

	@Override
	public List<Curso> eliminarCurso(int codCurso) {
		Curso curso = null;

		for (Curso cur : cursos)
			if (cur.getCodCurso() == codCurso)
				curso = cur;

		if (curso != null) {
			int pos = cursos.indexOf(curso);
			if (pos >= 0)
				cursos.remove(pos);
		}

		return cursos;
	}

	@Override
	public List<Curso> rangoPrecio(float min, float max) {

		List<Curso> cursosPrecio = new ArrayList<Curso>();

		for (Curso curso : cursos)
			if (curso.getPrecio() >= min && curso.getPrecio() <= max)
				cursosPrecio.add(curso);
		
		return cursosPrecio;
	}
}
