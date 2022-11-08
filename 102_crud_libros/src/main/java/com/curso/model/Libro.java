package com.curso.model;

public class Libro {

	private final String isbn;
	private String titulo, tematica;

	public Libro(String isbn, String titulo, String tematica) {
		super();
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

	public String getIsbn() {
		return isbn;
	}

}