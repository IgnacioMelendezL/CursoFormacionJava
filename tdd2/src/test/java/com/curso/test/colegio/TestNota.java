package com.curso.test.colegio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.curso.colegio.Nota;

class TestNota {

	@Test
	void test() {
		Nota nota1 = new Nota(10, "Java");
		Nota nota2 = new Nota(7, "C++");
		Nota nota3 = new Nota(4, "Python");
		Nota nota4 = new Nota(7, "Dormir");
		Nota nota5 = new Nota(3, "Java");
		
		assertTrue(nota4.getValor() == nota2.getValor());
		assertTrue(nota1.esMismaAsignatura(nota5));

		assertTrue(nota4.esIgual(new Nota(7, "Dormir")));
		
		assertFalse(nota1.esMismaAsignatura(nota4));
		assertFalse(nota2.getValor() == nota3.getValor());
		assertFalse(nota3.esMismaAsignatura(new Nota()));
		assertFalse(new Nota().esIgual(nota5));
	}
}