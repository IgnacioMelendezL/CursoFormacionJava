package com.curso.modelo;

public class Producto {
	private String nombre;
	private float precio;
	private String seccion;
	private int stock;
	
	public Producto(String nombre, float precio, String seccion, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.seccion = seccion;
		this.stock = stock;
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
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

}
