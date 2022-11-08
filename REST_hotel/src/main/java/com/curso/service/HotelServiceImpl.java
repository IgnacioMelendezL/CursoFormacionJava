package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelesDao;
import com.curso.model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelesDao dao;

	@Override
	public List<Hotel> getAll() {
		return dao.findAll();
	}

	@Override
	public Hotel get(int id_hotel) {
		return dao.findById(id_hotel).orElse(null);
	}
}