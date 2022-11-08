package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.LineaPedido;

public interface LineaPedidoDao extends JpaRepository<LineaPedido, Integer> {

}
