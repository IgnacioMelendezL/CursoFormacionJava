package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;

public interface ReservaService {
	List<Reserva> reservas();
	void registrar(Reserva reserva);
	List<Reserva> obtenerReservas(String nombreReserva);

}

