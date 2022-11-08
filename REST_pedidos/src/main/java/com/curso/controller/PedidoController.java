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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class PedidoController {

	@Autowired
	PedidoService service;

	@ApiOperation(value = "Devuelve todos los pedidos")
	@GetMapping(value = "pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> pedidos() {
		return service.getAll();
	}

	@ApiOperation(value = "Crea un nuevo pedido según la ID del producto y las unidades que se van a comprar")
	@PostMapping(value = "crearPedido/{id_producto}/{unidades}")
	public void postPedido(@ApiParam(value = "ID del producto") @PathVariable("id_producto") int id_producto, 
						@ApiParam(value = "Unidades que se van a comprar del producto") @PathVariable("unidades") int unidades) {
		service.postPedido(id_producto, unidades);
	}
}