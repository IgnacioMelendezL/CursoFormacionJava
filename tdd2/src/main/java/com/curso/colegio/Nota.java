package com.curso.colegio;

import java.util.Objects;

public class Nota {
	private int valor;
	private String asignatura;

	public Nota() {
		this.asignatura = "";
	}

	public Nota(int valor, String asignatura) {
		this.valor = valor;
		this.asignatura = asignatura;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public boolean esMismaAsignatura(Nota otra) {
		return this.asignatura.equals(otra.getAsignatura());
	}
	
	public boolean esIgual(Nota otra) {
		return this == otra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asignatura, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return Objects.equals(asignatura, other.asignatura) && valor == other.valor;
	}
	
	
}