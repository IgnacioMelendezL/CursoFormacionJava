package com.curso;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletInvalido")
public class ServletInvalido extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();

		pw.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"ISO-8859-1\">\r\n"
				+ "    <title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "<h1>Contraseña invalida</h1>"
				+ "    <form action=\"ServletLogin\" method=\"post\">\r\n"
				+ "        <label for=\"nombre\">Nombre</label><input type=\"text\" name=\"nombre\"><br>\r\n"
				+ "        <label for=\"contra\">Password</label><input type=\"password\" name=\"contra\"><br>\r\n"
				+ "        <input type=\"submit\" value=\"Enviar\">\r\n"
				+ "    </form>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");

		pw.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
