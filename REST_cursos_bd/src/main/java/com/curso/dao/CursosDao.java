package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Curso;

public interface CursosDao extends JpaRepository<Curso, Integer> {

	@Query(value = "SELECT * FROM cursos WHERE precio BETWEEN ?1 AND ?2", nativeQuery = true)
	List<Curso> findByPrecioBetween(float min, float max);
}
