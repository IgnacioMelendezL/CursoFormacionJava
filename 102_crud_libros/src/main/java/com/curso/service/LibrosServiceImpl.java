package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Libro;

@Service
public class LibrosServiceImpl implements LibrosService {

	public List<Libro> libros = new ArrayList<Libro>(
			List.of(new Libro("asdf1234", "Programación en Java", "Informática"),
					new Libro("xbhf5616", "Programación en C++", "Informática"),
					new Libro("kyuk2683", "Recetas Termomix", "Cocina"),
					new Libro("cnvn1379", "El libro gordo de Petete", "Varios")));

	@Override
	public List<Libro> libros() {
		return libros;
	}

	@Override
	public Libro buscarLibro(String isbn) {
		Libro libro = null;

		for (Libro lib : libros)
			if (lib.getIsbn().equals(isbn))
				libro = lib;

		return libro;
	}

	@Override
	public void insertarLibro(Libro libro) {
		libros.add(libro);
	}

	@Override
	public void modificarLibro(Libro libroModificado) {
		Libro libro = null;

		for (Libro lib : libros)
			if (lib.getIsbn().equals(libroModificado.getIsbn()))
				libro = lib;

		if (libro != null) {
			int pos = libros.indexOf(libro);
			if (pos >= 0) {
				libros.set(pos, libroModificado);
			}
		}
	}

	@Override
	public List<Libro> eliminarLibro(String isbn) {
		Libro libro = null;

		for (Libro lib : libros)
			if (lib.getIsbn().equals(isbn))
				libro = lib;

		if (libro != null) {
			int pos = libros.indexOf(libro);
			if (pos >= 0)
				libros.remove(pos);
		}

		return libros;
	}
}
