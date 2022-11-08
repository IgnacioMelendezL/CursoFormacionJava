package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.modelo.Ejemplar;

@Service
public class EjemplaresServiceImpl implements EjemplaresService {

	@Autowired
	RestTemplate template;

	@Override
	public List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar) {
		String url = "http://localhost:8080";
		template.postForLocation(url + "/libro", ejemplar);
		return List.of(template.getForObject(url + "/libros", Ejemplar[].class));
	}

}
