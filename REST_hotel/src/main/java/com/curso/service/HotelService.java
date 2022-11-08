package com.curso.service;

import java.util.List;

import com.curso.model.Hotel;

public interface HotelService {
	List<Hotel> getAll();

	Hotel get(int id_hotel);
}