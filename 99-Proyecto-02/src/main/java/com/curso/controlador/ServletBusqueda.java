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

@WebServlet("/ServletBusqueda")
public class ServletBusqueda extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        
        pw.println("<!DOCTYPE html>\r\n"
                + "<html lang=\"en\">\r\n"
                + "<head>\r\n"
                + "    <meta charset=\"UTF-8\">\r\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
                + "    <title>Document</title>\r\n"
                + "</head>\r\n"
                + "<body>\r\n"
                + "    <center>\r\n");

        if(Tienda.busqueda(request.getParameter("secc")).isEmpty()) {
        	int cont = 1;
        	
        	pw.println("<h3><b>Secciones disponibles: </b></h3>");
        	
            for (String seccion : Tienda.getSecciones()) {
                pw.println(cont++ + ". " + seccion + "<br>");
            }
        }
        
        
        if(!Tienda.busqueda(request.getParameter("secc")).isEmpty()) {
            pw.println("        <table border=\"1\" class=\"default\" >\r\n"
                    + "            <h1><caption>Busqueda:</caption></h1><br>\r\n"
                    + "            <tr>\r\n"
                    + "              <th>Producto</th>\r\n"
                    + "              <th>Precio</th>\r\n"
                    + "              <th>Seccion</th>\r\n"
                    + "              <th>Stock</th>\r\n"
                    + "            </tr>\r\n"
                    + "          \r\n");
            
            for (Producto prod : Tienda.busqueda(request.getParameter("secc"))) {
                pw.println("            <tr>\r\n"
                        + "              <td>" + prod.getNombre() + "</td>\r\n"
                        + "              <td>" + prod.getPrecio() + "</td>\r\n"
                        + "              <td>" + prod.getSeccion() +"</td>\r\n"
                        + "              <td>" + prod.getStock() + "</td>\r\n"
                        + "            </tr>");
            }    
        }
        
        pw.println("          </table><br>\r\n"
                + "        <a href=\"index.html\">Volver</a>\r\n"
                + "<br><br><aside><img src=\"https://www.emagister.com/es/albums/9/0/0/8/9/xl_cropped_19bcea5e643eba857ac802812c74df45.jpg\"></aside><br>"
                + "<p> <i>Publicidad</i></p>"
                + "    </center>\r\n"
                + "</body>\r\n"
                + "</html>");
    }
}