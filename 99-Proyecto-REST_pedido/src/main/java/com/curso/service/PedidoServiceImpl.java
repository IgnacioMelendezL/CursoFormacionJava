package com.curso.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.PedidoDao;
import com.curso.model.Pedido;

@Service
public class PedidoServiceImpl implements PedidoService {
	private String url = "http://servicio-productos/";

	@Autowired
	RestTemplate template;
	@Autowired
	PedidoDao dao;

	@Override
	public float solicitarPrecio(int id_producto) {
		return template.getForObject(url + "precio/" + id_producto, Float.class);
	}

	@Override
	public int solicitarStock(int id_producto) {
		return template.getForObject(url + "stock/" + id_producto, Integer.class);
	}

	@Override
	public void annadirPedido(int id_producto, int unidades) {
		Pedido pedido = new Pedido();

		System.out.println(solicitarStock(id_producto));
		System.out.println(solicitarPrecio(id_producto));

		if (unidades < solicitarStock(id_producto)) {
			pedido.setId_producto(id_producto);
			pedido.setFecha(new Date(System.currentTimeMillis()));
			pedido.setUnidades(unidades);
			pedido.setTotal(unidades * solicitarPrecio(id_producto));
			dao.save(pedido);
			template.put(url + "producto/" + id_producto + "/ " + unidades, Integer.class);
		}
	}

	@Override
	public List<Pedido> pedidos() {
		return dao.findAll();
	}

}
