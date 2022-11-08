package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursosDao;
import com.curso.model.Curso;

@Service
public class CursosServiceImpl implements CursosService {

	@Autowired
	CursosDao dao;

	@Override
	public Curso buscarCurso(int codCurso) {
		return dao.findById(codCurso).orElse(new Curso());
	}

	@Override
	public List<Curso> altaCurso(Curso curso) {
		dao.save(curso);
		return dao.findAll();
	}

	@Override
	public void modificarDuracion(int codCurso, int duracion) {
		Curso curso = dao.findById(codCurso).orElse(new Curso());
		curso.setDuracion(duracion);
		dao.save(curso);
	}

	@Override
	public List<Curso> eliminarCurso(int codCurso) {
		dao.deleteById(codCurso);
		return dao.findAll();
	}

	@Override
	public List<Curso> rangoPrecio(float min, float max) {
		return dao.findByPrecioBetween(min, max);
	}

	public List<Curso> cursos() {
		return dao.findAll();
	}
}
