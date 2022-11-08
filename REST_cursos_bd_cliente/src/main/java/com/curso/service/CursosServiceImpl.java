package com.curso.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Formacion;

@Service
public class CursosServiceImpl implements CursosService {

	@Autowired
	RestTemplate template;

	private String url = "http://localhost:8090/";

	@Override
	public List<Formacion> mostrarFormaciones() {

		List<Formacion> formaciones = new ArrayList<Formacion>();

		Object[] cursos = template.getForObject(url + "cursos", Object[].class);
		for (Object curso : cursos) {
			Formacion formacion = new Formacion();

//			formacion.setCodCurso((Integer) (((HashMap) curso).get("codCurso")));
			formacion.setCurso((String) (((HashMap) curso).get("nombre")));
			formacion.setAsignaturas(((Integer) (((HashMap) curso).get("duracion"))) >= 50 ? 10 : 5);
			formacion.setPrecio(((Double) (((HashMap) curso).get("precio"))).floatValue());

			formaciones.add(formacion);
		}

		return formaciones;
	}

	@Override
	public void altaCurso(Formacion formacion) {
		Object nuevoCurso = new Object();
		boolean existeCurso = false;

		Object[] cursos = template.getForObject(url + "cursos", Object[].class);
		for (Object curso : cursos) {
			if(((String) (((HashMap) curso).get("nombre"))).equals(formacion.getCurso())) {
				existeCurso = true;
			}
		}
		
		if(cursos.length > 0)
			nuevoCurso = cursos[0];
		
		((HashMap<String, String>) nuevoCurso).put("codCurso", String.valueOf(cursos.length + 1));
		((HashMap<String, String>) nuevoCurso).put("nombre", formacion.getCurso());
		((HashMap<String, String>) nuevoCurso).put("duracion", String.valueOf((formacion.getAsignaturas() <= 5 ? 5 : 50)));
		((HashMap<String, String>) nuevoCurso).put("precio", String.valueOf(formacion.getPrecio()));
		
		if (!existeCurso)
			template.postForLocation(url + "curso", nuevoCurso);
	}
}