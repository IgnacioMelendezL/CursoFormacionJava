package com.curso.test.utilidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.curso.utilidades.Calculadora;

public class CalculadoraTest {

	@Test
//	@DisplayName("Suma de dos números")
	void testSumar() {
		// Arrange // Act // Assert
		assertEquals(0f, Calculadora.sumar(0f, 0f));
		assertEquals(2f, Calculadora.sumar(1f, 1f));
		assertEquals(10, Calculadora.sumar(10, 0));
		assertEquals(10, Calculadora.sumar(0, 10));
	}

	@Test
	void testRestar() {
		// Arrange // Act // Assert
		assertEquals(0f, Calculadora.restar(0f, 0f));
		assertEquals(0f, Calculadora.restar(1f, 1f));
		assertEquals(10, Calculadora.restar(10, 0));
		assertEquals(-10, Calculadora.restar(-10, 0));
		assertEquals(-10, Calculadora.restar(0, 10));
		assertEquals(10, Calculadora.restar(0, -10));
	}

	@Test
	void testMultiplicar() {
		// Arrange // Act // Assert
		assertEquals(0f, Calculadora.multiplicar(0f, 0f));
		assertEquals(1f, Calculadora.multiplicar(1f, 1f));
		assertEquals(0, Calculadora.multiplicar(10, 0));
		assertEquals(0, Calculadora.multiplicar(0, 10));
		assertEquals(100, Calculadora.multiplicar(10, 10));
	}

	@Test
	void testDividir() {
		// Arrange // Act // Assert
		assertEquals(0f, Calculadora.dividir(0f, 0f));
		assertEquals(1f, Calculadora.dividir(1f, 1f));
		assertEquals(0, Calculadora.dividir(10, 0));
		assertEquals(0, Calculadora.dividir(0, 10));
	}

	@Test
	void testModulo() {
		// Arrange // Act // Assert
		assertEquals(0f, Calculadora.modulo(0f, 0f));
		assertEquals(0f, Calculadora.modulo(1f, 1f));
		assertEquals(0, Calculadora.modulo(10, 0));
		assertEquals(0, Calculadora.modulo(0, 10));
	}

	@Test
	void testAbsoluto() {
		// Arrange // Act // Assert
		assertEquals(0f, Calculadora.absoluto(0f));
		assertEquals(1f, Calculadora.absoluto(1f));
		assertEquals(10, Calculadora.absoluto(10));
		assertEquals(0, Calculadora.absoluto(-0));
		assertEquals(10, Calculadora.absoluto(-10));
		assertEquals(1, Calculadora.absoluto(-1));
	}
}