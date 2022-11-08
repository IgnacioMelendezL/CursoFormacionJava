package com.curso;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletPersona")
public class ServletPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();

	     pw.println("<!DOCTYPE html>\r\n"
	     		+ "<html lang=\"en\">\r\n"
	     		+ "\r\n"
	     		+ "<head>\r\n"
	     		+ "    <title></title>\r\n"
	     		+ "    <meta charset=\"UTF-8\">\r\n"
	     		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
	     		+ "</head>\r\n"
	     		+ "\r\n"
	     		+ "<body>\r\n"
	     		+ "    <h2>Persona registrada</h2>\r\n"
	     		+ "    <p>Hola " + request.getParameter("nombre") + ", gracias por matricularse en nuestros cursos</p>\r\n"
	     		+ "\r\n"
	     		+ "    Aquí podrá encontrar el <a href=\"matriculacion.html\">formulario de los cursos</a>\r\n"
	     		+ "</body>\r\n"
	     		+ "\r\n"
	     		+ "</html>");

	     request.getSession().setAttribute("user", new Persona(request.getParameter("nombre"), new ArrayList<String>()));
	     
     pw.close();
	}

}
