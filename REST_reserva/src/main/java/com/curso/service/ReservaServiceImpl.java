package com.curso.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservaDao;
import com.curso.model.Reserva;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	ReservaDao dao;

	@Autowired
	RestTemplate template;

	@Override
	public List<Reserva> reservas() {
		return dao.findAll();
	}

	@Override
	public void registrar(Reserva reserva) {
		dao.save(reserva);
		int actuPlazas = 0;
		List<Object> vuelos = List.of(template.getForObject(
				"http://localhost:8082/disponibilidadVuelos/" + reserva.getPersonas_reserva(), Object[].class));

		for (Object object : vuelos) {
			if ((Integer) (((HashMap) object).get("id_vuelo")) == reserva.getId_vuelo()) {
				actuPlazas = (Integer) (((HashMap) object).get("plazas_disponibles"));
			}
		}

		template.put("http://localhost:8082/actualizarPlazas/" + reserva.getId_vuelo() + "/"
				+ (actuPlazas - reserva.getPersonas_reserva()), reserva);
	}

	@Override
	public List<Reserva> obtenerReservas(String nombreReserva) {
		int id_hotel = 0;

		List<Object> hoteles = List
				.of(template.getForObject("http://localhost:8081/hotelesDisponibles/", Object[].class));

		for (Object object : hoteles) {
			if (((HashMap) object).get("nombre").toString().equalsIgnoreCase(nombreReserva)) {
				System.out.println(((HashMap) object).get("nombre").toString());
				id_hotel = (Integer) (((HashMap) object).get("id_hotel"));
			}
		}
		return dao.reservas(id_hotel);
	}
}