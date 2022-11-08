package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Producto;

public interface ProductosDao extends JpaRepository<Producto, Integer> {
	@Query(value = "SELECT precio FROM producto WHERE id_producto = ?1", nativeQuery = true)
	float findPrecioByIdProducto(int id_producto);
	
	@Query(value = "SELECT * FROM producto WHERE id_producto = ?1", nativeQuery = true)
	Producto findByIdProducto(int id_producto);
}
