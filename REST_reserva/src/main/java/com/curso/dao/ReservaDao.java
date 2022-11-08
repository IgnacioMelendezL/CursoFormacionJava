package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Reserva;


public interface ReservaDao extends JpaRepository<Reserva, Integer> {

	@Query(value = "SELECT * FROM reserva WHERE id_hotel = ?1", nativeQuery = true)
	public List<Reserva> reservas(int id_hotel);
}
