package com.curso.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedido") // nombre de la tabla de la bbdd
public class Pedido {

	@Id // Clave primaria
	private int id_pedido;
	private Date fecha_pedido;
	private String nombre_cliente;
	public float total;

	public Pedido() {
	}

	public Pedido(int id_pedido, Date fecha_pedido, String nombre_cliente, float total) {
		this.id_pedido = id_pedido;
		this.fecha_pedido = fecha_pedido;
		this.nombre_cliente = nombre_cliente;
		this.total = total;
	}

	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Date getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(Date fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
}