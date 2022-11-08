package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reserva") //nombre de la tabla de la bbdd
public class Reserva {
	
	@Id //Clave primaria
	private int id_reserva;
	private String nombre_cliente;
	private String dni;
	private int id_hotel;
	private int id_vuelo;
	private int personas_reserva;
	
	public Reserva(int id_reserva, String nombre_cliente, String dni, int id_hotel, int id_vuelo,
			int personas_reserva) {
		super();
		this.id_reserva = id_reserva;
		this.nombre_cliente = nombre_cliente;
		this.dni = dni;
		this.id_hotel = id_hotel;
		this.id_vuelo = id_vuelo;
		this.personas_reserva = personas_reserva;
	}

	public Reserva() {
		super();
	}

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	public int getId_vuelo() {
		return id_vuelo;
	}

	public void setId_vuelo(int id_vuelo) {
		this.id_vuelo = id_vuelo;
	}

	public int getPersonas_reserva() {
		return personas_reserva;
	}

	public void setPersonas_reserva(int personas_reserva) {
		this.personas_reserva = personas_reserva;
	}
}
