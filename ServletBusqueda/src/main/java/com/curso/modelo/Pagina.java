package com.curso.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pagina {
	public static List<Pagina> paginas = new ArrayList<Pagina>(List.of(
			new Pagina("www.hbomax.com", "series", "Series de HBO online"), 
			new Pagina("www.marca.com", "periodico", "Periódico deportivo"), 
			new Pagina("www.antena3.com", "television", "Canal de television Antena 3"),
			new Pagina("www.netflix.com", "series", "Series de Netflix online"),
			new Pagina("www.primevideo.com", "series", "Series de Amazon Prime online"),
			new Pagina("www.game.es", "juegos", "Tienda de juegos")));

	private String direccion, tematica, descripcion;

	public static List<Pagina> buscarPagina(String termino) {
		List<Pagina> encontradas = new ArrayList<Pagina>();

		for (Pagina pagina : paginas)
			if (pagina.tematica.equals(termino))
				encontradas.add(pagina);

		return encontradas;
	}

	public Pagina(String direccion, String tematica, String descripcion) {
		super();
		this.direccion = direccion;
		this.tematica = tematica;
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
