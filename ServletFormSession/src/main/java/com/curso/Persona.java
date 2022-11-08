package com.curso;

import java.util.List;

public class Persona {
	private String nombre;
	private List<String> cursos;
	
	public Persona(String nombre, List<String> cursos) {
		super();
		this.nombre = nombre;
		this.cursos = cursos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<String> getCursos() {
		return cursos;
	}
	public void setCursos(List<String> cursos) {
		this.cursos = cursos;
	}
	
	public void addCurso(String curso) {
		cursos.add(curso);
	}
	
	public void removeCurso(int i) {
		cursos.remove(i);
	}
}