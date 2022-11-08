package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;

public interface PedidoService {

	public List<Pedido> getAll();

	public void postPedido(int id_producto, int unidades);
}