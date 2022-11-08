package com.curso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso {

	@Id
	@Column(name="cod_curso")
	private int codCurso;
	private String nombre;
	private int duracion;
	private float precio;

	public Curso() {
		this.codCurso = 0;
		this.nombre = "";
		this.duracion = 0;
		this.precio = 0f;
	}

	public Curso(int codCurso, String nombre, int duracion, float precio) {
		this.codCurso = codCurso;
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
	}

	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
}