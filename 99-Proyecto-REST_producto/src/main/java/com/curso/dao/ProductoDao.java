package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Producto;

public interface ProductoDao extends JpaRepository<Producto, Integer> {

	// Método para hacer la consulta
	@Query(value = "SELECT precio FROM producto WHERE id_producto = ?1", nativeQuery = true)
	float findByPrecioIdProd(int id_producto);
	
	@Query(value = "SELECT stock FROM producto WHERE id_producto = ?1", nativeQuery = true)
	int findByStock(int id_producto);
	
	//@Query(value = "UPDATE producto SET stock = (stock- ?2) WHERE id_producto = ?1" , nativeQuery = true)
	//void actualizarStock(int id_producto, int stock);
}