package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.ProductoDao;
import com.curso.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoDao dao;

	@Override
	public List<Producto> productos() {
		return dao.findAll();
	}

	@Override
	public void actualizarStock(int id_producto, int stock) {
		//dao.actualizarStock(id_producto, stock);
		Producto prod = dao.findById(id_producto).orElse(null);
		prod.setStock(prod.getStock()-stock);
		dao.save(prod);
	}

	@Override
	public int devolverStock(int id_producto) {
		return dao.findByStock(id_producto);
	}

	@Override
	public float devolverPrecio(int id_producto) {
		return dao.findByPrecioIdProd(id_producto);
	}
}
