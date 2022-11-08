package com.curso;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletUsarSession")
public class ServletUsarSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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

		Enumeration<String> names = request.getSession().getAttributeNames();
		
		while (names.hasMoreElements()) {
			Producto producto = (Producto)request.getSession().getAttribute(names.nextElement());
			pw.println("<p>" + producto.getId() + " : " + producto.getConcepto() + " : " + producto.getImporte() + "</p>\r\n");
		}
		
        pw.println("<form action=\"ServletSession\">\r\n"
        		+ "    <input type=\"submit\" value=\"ServletSession\" />\r\n"
        		+ "</form>"
        		+ "</body>\r\n"
        		+ "\r\n"
        		+ "</html>");
     
     pw.close();
	}

}
