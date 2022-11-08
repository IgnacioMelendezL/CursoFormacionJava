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

@WebServlet("/ServletAlta")
public class ServletAlta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		float precio = -1f;
		int stock = -1;
		
		try {
			precio = Float.valueOf(request.getParameter("precio"));
			
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
	        		+ "<script>alert(\"ERROR: introduce un precio correcto (Ejemplo: 1.23)\"); document.location.href = \"alta.html\"</script>\r\n"
	        		+ "\r\n"
	        		+ "</html>");
	        pw.close();
		}

		try {
			stock = Integer.valueOf(request.getParameter("stock"));
			
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
	        		+ "<script>alert(\"ERROR: introduce un stock correcto (solo valores enteros)\"); document.location.href = \"alta.html\"</script>\r\n"
	        		+ "\r\n"
	        		+ "</html>");
	        pw.close();
		}
		
		if(precio >= 0 && stock >= 0) {
			Tienda.alta(new Producto(request.getParameter("nombre"), precio, request.getParameter("seccion"), stock));
	
			response.sendRedirect("index.html");
		}
	}
}
