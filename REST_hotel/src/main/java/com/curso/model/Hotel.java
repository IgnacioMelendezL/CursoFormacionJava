package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {
	@Id
	private int id_hotel;
	private String nombre;
	private float categoria;
	private float precio;
	private boolean disponible;

	public Hotel() {
		this.id_hotel = 0;
		this.nombre = "";
		this.categoria = 0f;
		this.precio = 0f;
		this.disponible = false;
	}

	public Hotel(int id_hotel, String nombre, float categoria, float precio, boolean disponible) {
		this.id_hotel = id_hotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}

	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCategoria() {
		return categoria;
	}

	public void setCategoria(float categoria) {
		this.categoria = categoria;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}