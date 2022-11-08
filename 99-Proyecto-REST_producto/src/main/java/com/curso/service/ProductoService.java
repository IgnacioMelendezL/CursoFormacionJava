package com.curso.service;

import java.util.List;

import com.curso.model.Producto;

public interface ProductoService {
	List<Producto> productos();
	void actualizarStock(int id_producto, int stock);
	int devolverStock(int id_producto);
	float devolverPrecio(int id_producto);
}
