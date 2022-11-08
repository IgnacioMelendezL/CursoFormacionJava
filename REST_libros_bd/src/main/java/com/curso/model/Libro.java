package com.curso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="libros")
public class Libro {
	@Id
	private int isbn;
	@Column(name="titulo")
	private String titulo;
	private String tematica;

	public Libro() {
		this.isbn = 0;
		this.titulo = "";
		this.tematica = "";
	}

	public Libro(int isbn, String titulo, String tematica) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.tematica = tematica;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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

}
