package com.curso;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextoLeer
 */
@WebServlet("/ServletContextoLeer")
public class ServletContextoLeer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"ISO-8859-1\">\r\n"
				+ "    <title>Hola y formulario GET</title>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "    <p>Hola " + request.getServletContext().getAttribute("nombre") + "</p>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");
		
		pw.close();
	}

}
