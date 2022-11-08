package com.curso.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.PedidoDao;
import com.curso.model.Pedido;

@Service
public class PedidoServiceImpl implements PedidoService {
//	private String url = "http://localhost:8000/";
	private String url = "http://productos-servicio:8000/";

	@Autowired
	PedidoDao dao;

	@Autowired
	RestTemplate template;

	@Override
	public List<Pedido> getAll() {
		return dao.findAll();
	}

	@Override
	public void postPedido(int id_producto, int unidades) {
		Object producto = template.getForObject(url + "obtenerProducto/" + id_producto, Object.class);

		int stock = (Integer) (((HashMap) producto).get("stock"));
		float precio = ((Double) (((HashMap) producto).get("precio"))).floatValue();

		Pedido pedido = new Pedido();
		pedido.setId_producto(id_producto);

		if (unidades <= stock) { // Si hay suficiente stock
			pedido.setUnidades(unidades);
			pedido.setTotal(precio * unidades);
			template.put(url + id_producto + "/" + (stock - unidades), Integer.class);	// ERROR: forma mal el path?
		} else { // Si NO hay suficiente stock
			pedido.setUnidades(stock);
			pedido.setTotal(precio * stock);
			template.put(url + id_producto + "/0", Integer.class);	// ERROR: forma mal el path?
		}

		dao.save(pedido);
	}
}