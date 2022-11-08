package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Reserva;
import com.curso.service.ReservaService;

@RestController
public class ReservaController {
	
	@Autowired
	ReservaService service;

	@GetMapping(value = "reservas/{hotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> reservas(@PathVariable("hotel") String hotel) {
		return service.obtenerReservas(hotel);
	}
	
	@PostMapping(value = "reservar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void registrarVuelo(@RequestBody Reserva reserva) {
		service.registrar(reserva);
	}

}
