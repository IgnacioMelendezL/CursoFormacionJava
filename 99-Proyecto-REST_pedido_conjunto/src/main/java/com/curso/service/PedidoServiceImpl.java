package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.PedidoDao;
import com.curso.model.Pedido;

@Service
public class PedidoServiceImpl implements PedidoService {
	private String urlProductos = "http://servicio-productos/";
	private String urlLineaPedido = "http://servicio-lineapedido/";

	@Autowired
	RestTemplate template;
	
	@Autowired
	PedidoDao dao;

	@Override
	public float solicitarPrecio(int id_producto) {
		return template.getForObject(urlProductos + "precio/" + id_producto, Float.class);
	}

	@Override
	public int solicitarStock(int id_producto) {
		return template.getForObject(urlProductos + "stock/" + id_producto, Integer.class);
	}

	@Override
	public void anadirPedido(Pedido pedido) {
		if(dao.findById(pedido.getId_pedido()).isEmpty())
			dao.save(pedido);
	}

	@Override
	public void actualizarPedido(int id_pedido, int id_producto, int unidades) {
		// Actualizar total del pedido
		Pedido pedido = dao.findById(id_pedido).orElse(null);
		
		// Si el pedido existe y hay stock suficiente para el pedido
		if (pedido != null && unidades <= solicitarStock(id_producto)) {
			pedido.setTotal(pedido.getTotal() + unidades * solicitarPrecio(id_producto));
			dao.save(pedido);
			
			// Recurso para insertar en la tabla linea_pedido
			template.postForLocation(urlLineaPedido + "linea_pedido/" + id_pedido + "/" + id_producto + "/" + unidades, Integer.class);
			// Recurso para modificar en la tabla producto
			template.put(urlProductos + "producto/" + id_producto + "/ " + unidades, Integer.class);
		}
	}

	@Override
	public List<Pedido> pedidos() {
		return dao.findAll();
	}

	@Override
	public List<Object> lineaPedidos() {
		return List.of(template.getForObject(urlLineaPedido + "linea_pedidos", Object[].class));
	}

	public float precioTotal(int id_pedido) {
		return dao.findTotalByIdProducto(id_pedido);
	}
}