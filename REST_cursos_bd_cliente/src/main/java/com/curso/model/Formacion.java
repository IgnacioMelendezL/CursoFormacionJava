package com.curso.model;

public class Formacion {
	private String curso;
	private int asignaturas;
	private float precio;

	public Formacion() {
		this.curso = "";
		this.asignaturas = 0;
		this.precio = 0f;
	}

	public Formacion(String curso, int asignaturas, float precio) {
		this.curso = curso;
		this.asignaturas = asignaturas;
		this.precio = precio;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}