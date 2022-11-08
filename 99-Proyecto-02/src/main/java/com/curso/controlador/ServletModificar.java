package com.curso.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.service.Tienda;

/**
 * Servlet implementation class ServletModificar
 */
@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Tienda.modificar(request.getParameter("nombre"), Float.valueOf(request.getParameter("precio")));
			
			response.sendRedirect("index.html");
			
		} catch(NumberFormatException e) {
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
	        		+ "</body>\r\n"
	        		+ "<script>alert(\"ERROR: introduce un precio correcto (Ejemplo: 1.23)\"); document.location.href = \"modificar.html\"</script>\r\n"
	        		+ "\r\n"
	        		+ "</html>");
	        pw.close();
		}
	}

}
