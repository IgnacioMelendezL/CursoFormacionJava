package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Producto;
import com.curso.service.ProductoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class ProductoController {
	@Autowired
	ProductoService service;

	@ApiOperation(value = "Devuelve todos los productos")
	@GetMapping(value = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> productos() {
		return service.productos();
	}

	@ApiOperation(value = "Devuelve el precio de un producto según su ID")
	@GetMapping(value = "precio/{id_producto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public float devolverPrecio(@ApiParam(value = "ID del producto") @PathVariable("id_producto") int id_producto) {
		return service.devolverPrecio(id_producto);
	}

	@ApiOperation(value = "Devuelve el stock de un producto según su ID")
	@GetMapping(value = "stock/{id_producto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public int devolverStock(@ApiParam(value = "ID del producto") @PathVariable("id_producto") int id_producto) {
		return service.devolverStock(id_producto);
	}

	@ApiOperation(value = "Actualiza el stock de un producto según su ID")
	@PutMapping(value = "producto/{id_producto}/{stock}")
	void actualizarStock(@ApiParam(value = "ID del producto") @PathVariable("id_producto") int id_producto, @ApiParam(value = "Unidades del producto") @PathVariable("stock") int stock) {
		service.actualizarStock(id_producto, stock);
	}
}
