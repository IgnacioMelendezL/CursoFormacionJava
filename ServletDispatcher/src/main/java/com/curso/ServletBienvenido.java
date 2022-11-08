package com.curso;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletBienvenido")
public class ServletBienvenido extends HttpServlet {
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
				+ "    <h1>¡Bienvenido " + request.getParameter("nombre") + "!</h1>\r\n"
				+ "    <p>Conexión: " + new SimpleDateFormat("HH:mm:ss").format(new Date(request.getSession().getCreationTime())) + "</p>\r\n"
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