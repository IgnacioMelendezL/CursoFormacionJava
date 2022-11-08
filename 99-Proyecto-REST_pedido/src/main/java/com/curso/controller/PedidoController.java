package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pedido;
import com.curso.service.PedidoService;

@RestController
public class PedidoController {
	@Autowired
	PedidoService service;

	@GetMapping(value = "pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> pedidos() {
		return service.pedidos();
	}

	@GetMapping(value = "stock/{id_producto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public int stock(@PathVariable("id_producto") int id_producto) {
		return service.solicitarStock(id_producto);
	}

	@GetMapping(value = "precio/{id_producto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public float precio(@PathVariable("id_producto") int id_producto) {
		return service.solicitarPrecio(id_producto);
	}

	@PostMapping(value = "producto/{id_producto}/{stock}")
	public void annadirPedido(@PathVariable("id_producto") int id_producto, @PathVariable("stock") int stock) {
		service.annadirPedido(id_producto, stock);
	}

}
