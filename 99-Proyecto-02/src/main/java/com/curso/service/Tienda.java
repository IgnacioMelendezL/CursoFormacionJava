package com.curso.service;

import static java.util.Map.entry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.curso.modelo.Producto;

public class Tienda {
//	public static List<Producto> productos = new ArrayList<Producto>(List.of(new Producto("Mesa", 15f, "Mueble", 10),
//			new Producto("Silla", 31f, "Mueble", 10), new Producto("Armario", 67.99f, "Mueble", 10),
//			new Producto("Ordenador", 1f, "Electronica", 10), new Producto("Raton", 1f, "Electronica", 10),
//			new Producto("Teclado", 1f, "Electronica", 10), new Producto("Papelera", 1f, "Oficina", 10)));

	public static Map<String, Producto> productos = new HashMap<String, Producto>(
			Map.ofEntries(entry("Mesa", new Producto("Mesa", 15f, "Mueble", 10)),
					entry("Silla", new Producto("Silla", 31f, "Mueble", 10)),
					entry("Armario", new Producto("Armario", 67.99f, "Mueble", 10)),
					entry("Ordenador", new Producto("Ordenador", 1f, "Electronica", 10)),
					entry("Raton", new Producto("Raton", 10f, "Electronica", 10)),
					entry("Teclado", new Producto("Teclado", 33.3f, "Electronica", 10)),
					entry("Papelera", new Producto("Papelera", 5.89f, "Oficina", 10))));

	public static List<String> getSecciones() {
		Set<String> encontrado = new HashSet<String>();

		for (Entry<String, Producto> producto : productos.entrySet()) {
			encontrado.add(producto.getValue().getSeccion());
		}
		
		List<String> listaOrdenada = new ArrayList<>(encontrado);
		Collections.sort(listaOrdenada);
		return listaOrdenada;
	}

	public static List<Producto> busqueda(String seccion) {
		List<Producto> encontrado = new ArrayList<>();

		for (Entry<String, Producto> producto : productos.entrySet()) {
			if (producto.getValue().getSeccion().equalsIgnoreCase(seccion)) {
				encontrado.add(producto.getValue());
			}
		}
		return encontrado;
	}

	public static void alta(Producto prod) {
//		boolean flag = true;
//		for (Producto producto : productos) {
//			if (producto.getNombre().equalsIgnoreCase(prod.getNombre())) {
//				flag = false;
//				break;
//			}
//		}
//		if (flag) {
//			productos.add(prod);
//		}

		prod.setNombre(primeraMayus(prod.getNombre()));
		prod.setSeccion(primeraMayus(prod.getSeccion()));
		productos.put(prod.getNombre(), prod);
	}

	public static void eliminar(String nombre) {
//		int contador = 0;
//		for (Producto producto : productos) {
//			if (producto.getNombre().equalsIgnoreCase(prod)) {
//				productos.remove(contador);
//				break;
//			}
//			contador++;
//		}

		productos.remove(primeraMayus(nombre));
	}

	public static void modificar(String nombre, float precio) {
//		int contador = 0;
//		for (Producto producto : productos) {
//			if (producto.getNombre().equalsIgnoreCase(nombre)) {
//				productos.get(contador).setPrecio(precio);
//				break;
//			}
//			contador++;
//		}

		Producto producto = productos.get(primeraMayus(nombre));
		producto.setPrecio(precio);
		productos.put(producto.getNombre(), producto);
	}

	public static String primeraMayus(String cadena) {
		return cadena.toUpperCase().charAt(0) + cadena.substring(1, cadena.length()).toLowerCase();
	}
}
