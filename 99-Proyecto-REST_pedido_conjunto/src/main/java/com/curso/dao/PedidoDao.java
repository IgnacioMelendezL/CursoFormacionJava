package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Pedido;

public interface PedidoDao extends JpaRepository<Pedido, Integer> {
	
	@Query(value = "SELECT total FROM pedido WHERE id_producto = ?1", nativeQuery = true)
	float findTotalByIdProducto(int id_producto);
}
