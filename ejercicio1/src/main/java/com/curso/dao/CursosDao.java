package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Curso;

public interface CursosDao extends JpaRepository<Curso, Integer> {
	@Query("Select c from Curso c Where c.precio between ?1 and ?2")
	List<Curso> findByPrecioBetween(double min, double max);

	@Modifying
	@Transactional
	@Query("update Curso c set c.duracion = ?1 where c.codCurso = ?2")
	void actualizarDuracionCurso(int duracion, int codCurso);
}
