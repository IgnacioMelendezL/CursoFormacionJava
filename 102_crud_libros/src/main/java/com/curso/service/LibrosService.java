package com.curso.service;

import java.util.List;

import com.curso.model.Libro;

public interface LibrosService {
	List<Libro> libros();

	Libro buscarLibro(String isbn);

	void insertarLibro(Libro libro);

	void modificarLibro(Libro libro);

	List<Libro> eliminarLibro(String isbn);
}
