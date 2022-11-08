package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VuelosDao;
import com.curso.model.Vuelo;

@Service
public class VueloServiceImpl implements VueloService {
	@Autowired
	VuelosDao dao;

	@Override
	public List<Vuelo> getByPlazasDisponibles(int plazas_disponibles) {
		return dao.findByPlazasDisponibles(plazas_disponibles);
	}

	@Override
	public void putPlazasDisponiblesFromVuelo(int id_vuelo, int plazas_disponibles) {
		Vuelo vuelo = dao.findById(id_vuelo).orElse(null);
		if(vuelo != null) {
			vuelo.setPlazas_disponibles(plazas_disponibles);
			dao.save(vuelo);
		}
	}
}