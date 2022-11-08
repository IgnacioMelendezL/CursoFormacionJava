package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.ProductosDao;
import com.curso.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductosDao dao;

	@Override
	public List<Producto> getAll() {
		return dao.findAll();
	}

	@Override
	public void putStock(int id_producto, int stock) {
		Producto producto = dao.findById(id_producto).orElse(null);
		producto.setStock(stock);
		dao.save(producto);
	}

	@Override
	public float getPrecio(int id_producto) {
		return dao.findPrecioByIdProducto(id_producto);
	}

	@Override
	public Producto getProducto(int id_producto) {
		return dao.findByIdProducto(id_producto);
	}
}