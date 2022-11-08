package com.curso.utilidades;

public class Conversor {
	public static float euros(float valor) {
		return valor * 166.386f;
	}
	public static float pesetas(float valor) {
		return valor / 166.386f;
	}
}
