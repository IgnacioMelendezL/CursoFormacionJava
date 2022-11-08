package com.curso.service;

import java.util.List;

import com.curso.model.Libro;

public interface LibrosService {
	List<Libro> libros();

	Libro buscarLibro(int isbn);

	void insertarLibro(Libro libro);

	void modificarLibro(Libro libro);

	void eliminarLibro(int isbn);

}
