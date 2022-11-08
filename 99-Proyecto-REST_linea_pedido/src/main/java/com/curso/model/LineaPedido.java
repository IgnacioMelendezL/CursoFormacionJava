package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="linea_pedido") //nombre de la tabla de la bbdd
public class LineaPedido {
	
	@Id //Clave primaria
	private int id_linea_pedido;
	private int id_pedido;
	private int id_producto;
	private int cantidad;
	
	public LineaPedido(int id_linea_pedido, int id_pedido, int id_producto, int cantidad) {
		super();
		this.id_linea_pedido = id_linea_pedido;
		this.id_pedido = id_pedido;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
	}

	public LineaPedido() {
		super();
	}

	public int getId_linea_pedido() {
		return id_linea_pedido;
	}

	public void setId_linea_pedido(int id_linea_pedido) {
		this.id_linea_pedido = id_linea_pedido;
	}

	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
