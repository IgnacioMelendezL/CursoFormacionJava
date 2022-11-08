package com.curso.service;

import java.util.List;

import com.curso.model.LineaPedido;

public interface LineaPedidoService {
	void anadirLineaPedido(int id_pedido, int id_producto, int cantidad);
	List<LineaPedido> devolverPedidos();
	LineaPedido devolverPedido(int id_pedido);
}
