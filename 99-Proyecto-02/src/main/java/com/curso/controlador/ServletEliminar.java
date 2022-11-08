package com.curso.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.modelo.Producto;
import com.curso.service.Tienda;

/**
 * Servlet implementation class ServletEliminar
 */
@WebServlet("/ServletEliminar")
public class ServletEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Tienda.eliminar(request.getParameter("nombre"));
        
		response.sendRedirect("index.html");
	}

}
