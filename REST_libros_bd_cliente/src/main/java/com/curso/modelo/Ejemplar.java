package com.curso.modelo;

public class Ejemplar {

	private final int isbn;
	private String titulo, tematica;

	public Ejemplar() {
		this.isbn = 0;
		this.titulo = "";
		this.tematica = "";
	}

	public Ejemplar(int isbn, String titulo, String tematica) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.tematica = tematica;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public int getIsbn() {
		return isbn;
	}

}