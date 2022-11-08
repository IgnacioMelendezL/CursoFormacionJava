package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.service.HotelService;

@RestController
public class HotelesController {
	@Autowired
	HotelService service;

	@GetMapping(value = "hotel/{id_hotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hotel getHotel(@PathVariable("id_hotel") int id_hotel) {
		return service.get(id_hotel);
	}

	@GetMapping(value = "hotelesDisponibles", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> getAllHoteles() {
		return service.getAll();
	}
}
