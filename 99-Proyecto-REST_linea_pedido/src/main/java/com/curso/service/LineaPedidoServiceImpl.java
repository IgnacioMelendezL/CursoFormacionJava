package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.LineaPedidoDao;
import com.curso.model.LineaPedido;

@Service
public class LineaPedidoServiceImpl implements LineaPedidoService{
	private String url = "http://servicio-productos/";
	
	@Autowired
	RestTemplate template;
	@Autowired
	LineaPedidoDao dao;

	@Override
	public void anadirLineaPedido(int id_pedido, int id_producto, int cantidad) {
		LineaPedido lp = new LineaPedido();
		lp.setId_pedido(id_pedido);
		lp.setId_producto(id_producto);
		lp.setCantidad(cantidad);
		dao.save(lp);
	}

	@Override
	public List<LineaPedido> devolverPedidos() {
		return dao.findAll();
	}

	@Override
	public LineaPedido devolverPedido(int id_pedido) {
		return dao.findById(id_pedido).orElse(null);
	}
}
