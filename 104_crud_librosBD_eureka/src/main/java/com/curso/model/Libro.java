package com.curso.model;

import javax.persistence.Entity;// Siempre de persistence
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="libros") //nombre de la tabla de la bbdd
public class Libro {
	
	@Id //Clave primaria
	private int isbn;
	
	//@Column(name="titulo") Si se llama diferente el campo en la BBDD
	private String titulo;
	private String tematica;
	
	//Constructores
	public Libro() {
		super();
	}
	public Libro(int isbn, String titulo, String tematica) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.tematica = tematica;
	}
	
	//GETTERS y SETTERS 
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
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", tematica=" + tematica + "]";
	}
	
}
