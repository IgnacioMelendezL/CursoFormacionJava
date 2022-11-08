package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.LineaPedido;
import com.curso.service.LineaPedidoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class LineaPedidoController {
	
	@Autowired
	LineaPedidoService service;
	
	@ApiOperation(value = "Devuelve una lista con las lineas de pedido.")
	@GetMapping(value = "linea_pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<LineaPedido> pedidos() {
		return service.devolverPedidos();
	}
	
	@ApiOperation(value = "Devuelve la linea de pedido según su identificador.")
	@GetMapping(value = "linea_pedido/{id_pedido}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LineaPedido pedido(@ApiParam(value = "Identificador del pedido") @PathVariable("id_pedido") int id_pedido) {
		return service.devolverPedido(id_pedido);
	}
	
	@ApiOperation(value = "Crea una linea de pedido según el identificador de pedido, un identificador de producto y una cantidad de ese producto.")
	@PostMapping(value = "linea_pedido/{id_pedido}/{id_producto}/{cantidad}")
	public void anadirLineaPedido(@ApiParam(value = "Identificador del pedido") @PathVariable("id_pedido") int id_pedido,
								  @ApiParam(value = "Identificador del producto") @PathVariable("id_producto") int id_producto,
								  @ApiParam(value = "Cantidad del producto") @PathVariable("cantidad") int cantidad) {
		service.anadirLineaPedido(id_pedido, id_producto, cantidad);
	}

}
