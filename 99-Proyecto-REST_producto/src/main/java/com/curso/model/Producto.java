package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto") //nombre de la tabla de la bbdd
public class Producto {
	
	@Id //Clave primaria
	private int id_producto;
	private String nombre;
	private float precio;
	private int stock;
	
	public Producto(int id_producto, String nombre, float precio, int stock) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public Producto() {
		super();
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock
				+ "]";
	}
	
}
