package com.curso.utilidades;

public class Calculadora {
	public static float sumar(float operando1, float operando2) {
		return operando1 + operando2;
	}

	public static float restar(float operando1, float operando2) {
		return operando1 - operando2;
	}

	public static float multiplicar(float operando1, float operando2) {
		return operando1 * operando2;
	}

	public static float dividir(float numerador, float denominador) {
		return denominador != 0 ? numerador / denominador : 0;
	}

	public static float modulo(float numerador, float denominador) {
		return denominador != 0 ? numerador % denominador : 0;
	}

	public static float absoluto(float operando) {
		return operando >= 0 ? operando : operando * -1f;
	}
}
