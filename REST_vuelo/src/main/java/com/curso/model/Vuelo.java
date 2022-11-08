package com.curso.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {
	@Id
	private int id_vuelo;
	private String compania;
	private Date fecha_vuelo;
	private float precio;
	private int plazas_disponibles;

	public Vuelo() {
		this.id_vuelo = 0;
		this.compania = "";
		this.fecha_vuelo = new Date();
		this.precio = 0f;
		this.plazas_disponibles = 0;
	}

	public Vuelo(int id_vuelo, String compania, Date fecha_vuelo, float precio, int plazas_disponible) {
		this.id_vuelo = id_vuelo;
		this.compania = compania;
		this.fecha_vuelo = fecha_vuelo;
		this.precio = precio;
		this.plazas_disponibles = plazas_disponible;
	}

	public int getId_vuelo() {
		return id_vuelo;
	}

	public void setId_vuelo(int id_vuelo) {
		this.id_vuelo = id_vuelo;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public Date getFecha_vuelo() {
		return fecha_vuelo;
	}

	public void setFecha_vuelo(Date fecha_vuelo) {
		this.fecha_vuelo = fecha_vuelo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getPlazas_disponibles() {
		return plazas_disponibles;
	}

	public void setPlazas_disponibles(int plazas_disponible) {
		this.plazas_disponibles = plazas_disponible;
	}
}