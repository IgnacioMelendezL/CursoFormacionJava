package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.LibrosDao;
import com.curso.model.Libro;

@Service
public class LibrosServiceImpl implements LibrosService {
	
	@Autowired
	LibrosDao dao;
	@Override
	public List<Libro> libros() {
		return dao.findAll();
	}

	@Override
	public Libro buscarLibro(int isbn) {
		return dao.findById(isbn).orElse(new Libro());
	}

	@Override
	public void altaLibro(Libro libro) {
		dao.save(libro);
	}

	@Override
	public void actualizarLibro(Libro libro) {
		dao.save(libro);
	}

	@Override
	public void eliminarLibro(int isbn) {
		dao.deleteById(isbn);
	}
	

	public static void setLibros(List<Libro> libros) {
		
	}

	/*public static void main(String[] args) {
		Libro libro = new Libro(00004, "Libro modificado", "Ciencia");
		Libro libroIns = new Libro(00007, "Libro insertado", "Cocina");
		LibrosServiceImpl ls = new LibrosServiceImpl();

		System.out.println("Libro buscado: " + ls.buscarLibro(00001).toString());
		System.out.println("Libros: " + ls.libros().toString());
		System.out.println();

		ls.actualizarLibro(libro);
		ls.altaLibro(libroIns);
		ls.eliminarLibro(00001);

		for (Libro lib : libros) {
			System.out.println(lib.toString());
		}
	}*/

}
