package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;

public interface PedidoService {
	float solicitarPrecio(int id_producto);

	int solicitarStock(int id_producto);

	void annadirPedido(int id_producto, int unidades);

	List<Pedido> pedidos();
}