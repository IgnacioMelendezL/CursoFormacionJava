package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Ejemplar;

@Service
public class EjemplarServiceImpl implements EjemplaresService {
	private String url = "http://servicio-libros/";

	@Autowired
	RestTemplate template;

	@Override
	public List<Object> ejemplares() {
		return List.of(template.getForObject(url + "libros", Object.class));
	}

	@Override
	public List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar) {
		template.postForLocation(url + "libro/", ejemplar);

		return List.of(template.getForObject(url + "libros", Ejemplar[].class));
	}
}