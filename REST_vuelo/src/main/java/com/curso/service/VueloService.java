package com.curso.service;

import java.util.List;

import com.curso.model.Vuelo;

public interface VueloService {

	List<Vuelo> getByPlazasDisponibles(int plazas_disponibles);

	void putPlazasDisponiblesFromVuelo(int id_vuelo, int plazas_disponibles);
}
