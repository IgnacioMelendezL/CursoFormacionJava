package com.curso;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletMayus")
public class ServletMayus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("cadena", request.getParameter("cadena").toUpperCase());
		RequestDispatcher dispatch = request.getRequestDispatcher("ServletMostrar");
		dispatch.forward(request, response);
	}

}
