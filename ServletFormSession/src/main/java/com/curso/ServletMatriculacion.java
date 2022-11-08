package com.curso;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletMatriculacion")
public class ServletMatriculacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		if(request.getParameter("desmatricular") == null)
			((Persona)request.getSession().getAttribute("user")).addCurso(request.getParameter("curso"));
		else
			((Persona)request.getSession().getAttribute("user")).removeCurso(Integer.parseInt(request.getParameter("desmatricular")));
		
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
	     		+ "    <h2>Cursos matriculados</h2>\r\n"
	     		+ "    <ol>Cursos:\r\n");
	     
	     int i = 0;
	     for(String curso : ((Persona)request.getSession().getAttribute("user")).getCursos())
	    	 pw.println("    	<li>" + curso + "<form action=\"ServletMatriculacion\" method=\"post\"><button name=\"desmatricular\" value=\"" + i++ + "\">Eliminar</button></form></li>\r\n");
	     
	     pw.println("</ol>\r\n"
	     		+ "    Aquí puede volver al <a href=\"matriculacion.html\">formulario del curso</a>\r\n"
	     		+ "</body>\r\n"
	     		+ "\r\n"
	     		+ "</html>");
     
     pw.close();
	}

}
