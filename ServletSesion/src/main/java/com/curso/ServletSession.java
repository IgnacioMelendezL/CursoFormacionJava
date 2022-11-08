package com.curso;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletSession")  
public class ServletSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		
		session.setAttribute("producto1", new Producto(1, "Producto 01", 2.35f));
		session.setAttribute("producto2", new Producto(2, "Producto 02", 33.3f));
		session.setAttribute("producto3", new Producto(3, "Producto 03", 14.7f));
		
		session.setMaxInactiveInterval(5);
//		session.setMaxInactiveInterval(5*60);

		PrintWriter pw = response.getWriter();

        pw.println("<!DOCTYPE html>\r\n"
        		+ "<html lang=\"en\">\r\n"
        		+ "\r\n"
        		+ "<head>\r\n"
        		+ "    <title></title>\r\n"
        		+ "    <meta charset=\"UTF-8\">\r\n"
        		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
        		+ "    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n"
        		+ "</head>\r\n"
        		+ "\r\n"
        		+ "<body>\r\n");

        pw.println("<p>Objetos almacenados en una sesion</p>");
		
        pw.println("<form action=\"ServletUsarSession\">\r\n"
        		+ "    <input type=\"submit\" value=\"ServletUsarSession\" />\r\n"
        		+ "</form>"
        		+ "</body>\r\n"
        		+ "\r\n"
        		+ "</html>");
        
        pw.close();
	}

}
