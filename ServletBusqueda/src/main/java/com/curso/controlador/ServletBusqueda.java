package com.curso.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.modelo.Pagina;

@WebServlet("/ServletBusqueda")
public class ServletBusqueda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Pagina> paginas = Pagina.buscarPagina(request.getParameter("busqueda"));
		
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
				+ "    <h3>Termino de busqueda: " + request.getParameter("busqueda") + "</h3><br><br>\r\n"
				+ "    <hr>\r\n");
		
		for(Pagina pagina : paginas)
			pw.println("    <h3><a href=\"https://" + pagina.getDireccion() + "\">" + pagina.getDireccion() + "</a></h3>\r\n"
					+ "    <h4>" + pagina.getDescripcion() + "</h4>\r\n"
					+ "    <hr><br>\r\n");
		
		pw.println("    <h4><a href=\"index.html\">&lt;--Volver</a></h4>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");

		pw.close();
	}

}
