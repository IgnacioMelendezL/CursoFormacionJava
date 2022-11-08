package com.curso.service;

import java.util.List;

import com.curso.model.Producto;

public interface ProductoService {
	public List<Producto> getAll();

	public void putStock(int id_producto, int stock);

	public float getPrecio(int id_producto);
	
	public Producto getProducto(int id_producto);
}
