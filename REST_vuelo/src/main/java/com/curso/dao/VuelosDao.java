package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Vuelo;

public interface VuelosDao extends JpaRepository<Vuelo, Integer> {

	@Query(value = "SELECT * FROM vuelo WHERE plazas_disponibles >= ?1", nativeQuery = true)
	List<Vuelo> findByPlazasDisponibles(int plazas_solicitadas);
}
