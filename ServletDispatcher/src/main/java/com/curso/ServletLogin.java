package com.curso;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Reiniciar sesion
		HttpSession session = request.getSession();
		if (!session.isNew()) {
		    session.invalidate();
		    session = request.getSession();
		}
		
		request.getSession(true);

		if (request.getParameter("nombre").equals("nacho") && request.getParameter("contra").equals("123")) {
			RequestDispatcher dispatch = request.getRequestDispatcher("ServletBienvenido");
			dispatch.forward(request, response);
		} else {
			RequestDispatcher dispatch = request.getRequestDispatcher("index.html");
			dispatch.include(request, response);
		}

	}

}