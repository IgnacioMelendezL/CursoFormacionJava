package com.curso.test.utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.curso.utilidades.Conversor;

class ConversorTest {

	@Test
	void testEuros() {
		// Arrange
//		Conversor.euros(0f);

		// Act
		float res = Conversor.euros(1f);

		// Assert
		assertEquals(166.386f, res);
	}

	@Test
	void testPesetas() {
		// Arrange
//		Conversor.pesetas(0f);

		// Act
		float res = Conversor.pesetas(166.386f);

		// Assert
		assertEquals(1f, res);
	}
}