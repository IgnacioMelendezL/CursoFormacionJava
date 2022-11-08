package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pedido;
import com.curso.service.PedidoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class PedidoController {
	@Autowired
	PedidoService service;

	@ApiOperation(value = "Devuelve todos los pedidos")
	@GetMapping(value = "pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> pedidos() {
		return service.pedidos();
	}

	@ApiOperation(value = "Devuelve el stock de un producto")
	@GetMapping(value = "stock/{id_producto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public int stock(@ApiParam(value = "ID del producto") @PathVariable("id_producto") int id_producto) {
		return service.solicitarStock(id_producto);
	}

	@ApiOperation(value = "Devuelve el precio de un producto")
	@GetMapping(value = "precio/{id_producto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public float precio(@ApiParam(value = "ID del producto") @PathVariable("id_producto") int id_producto) {
		return service.solicitarPrecio(id_producto);
	}

	@ApiOperation(value = "Crea un pedido nuevo")
	@PostMapping(value = "pedido", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void anadirPedido(@ApiParam(value = "Objeto pedido del cuerpo de la petición") @RequestBody Pedido pedido) {
		service.anadirPedido(pedido);
	}

	@ApiOperation(value = "Crea una linea de pedido nueva para un pedido")
	@PutMapping(value = "pedido/{id_pedido}/{id_producto}/{unidades}")
	public void actualizarPedido(@ApiParam(value = "ID del pedido") @PathVariable("id_pedido") int id_pedido, 
								@ApiParam(value = "ID del producto") @PathVariable("id_producto") int id_producto,
								@ApiParam(value = "Unidades del producto") @PathVariable("unidades") int unidades) {
		service.actualizarPedido(id_pedido, id_producto, unidades);
	}
}