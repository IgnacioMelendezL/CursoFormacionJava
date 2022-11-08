package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Vuelo;
import com.curso.service.VueloService;

@RestController
public class VueloController {
	@Autowired
	VueloService service;

	@GetMapping(value = "disponibilidadVuelos/{plazas_disponibles}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> getVuelos(@PathVariable("plazas_disponibles") int plazas_disponibles) {
		return service.getByPlazasDisponibles(plazas_disponibles);
	}

	@PutMapping(value = "actualizarPlazas/{id_vuelo}/{plazas_disponibles}")
	public void postPlazasDisponiblesFromVuelo(@PathVariable("id_vuelo") int id_vuelo,
			@PathVariable("plazas_disponibles") int plazas_disponibles) {
		service.putPlazasDisponiblesFromVuelo(id_vuelo, plazas_disponibles);
	}
}
