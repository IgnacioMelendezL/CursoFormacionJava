package com.curso;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
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
         		+ "<body>\r\n"
         		+ "    <form action=\"Servlet02\" method=\"POST\">\r\n"
         		+ "        <fieldset>\r\n"
         		+ "            <legend>Informacion personal</legend>\r\n"
         		+ "            <label for=\"nombre\">Nombre: </label><input type=\"text\" name=\"nombre\" id=\"nombre\">\r\n"
         		+ "            <label for=\"nombre\">Servlet01: </label><input type=\"text\" name=\"servlet01\" id=\"servlet01\">\r\n"
         		+ "        </fieldset>\r\n"
         		+ "\r\n"
         		+ "        <fieldset>\r\n"
         		+ "            <legend>Cursos</legend>\r\n"
         		+ "            <label for=\"pilates\">Pilates:</label><input type=\"checkbox\" id=\"pilates\" name=\"pilates\" value=\"pilates\"><br>\r\n"
         		+ "            <label for=\"yoga\">Yoga:</label><input type=\"checkbox\" id=\"yoga\" name=\"yoga\" value=\"yoga\"><br>\r\n"
         		+ "        </fieldset>\r\n"
         		+ "\r\n"
         		+ "        <fieldset>\r\n"
         		+ "            <legend>Color favorito</legend>\r\n"
         		+ "            <input type=\"radio\" id=\"rojo\" name=\"fav_color\" value=\"rojo\"><label for=\"rojo\">Rojo</label><br>\r\n"
         		+ "            <input type=\"radio\" id=\"verde\" name=\"fav_color\" value=\"verde\"><label for=\"verde\">Verde</label><br>\r\n"
         		+ "            <input type=\"radio\" id=\"azul\" name=\"fav_color\" value=\"azul\"><label for=\"azul\">Azul</label><br>\r\n"
         		+ "        </fieldset>\r\n"
         		+ "\r\n"
         		+ "        <fieldset>\r\n"
         		+ "            <legend>Coches</legend>\r\n"
         		+ "            <label for=\"cars\">Elige un o varios coches:</label><br>\r\n"
         		+ "\r\n"
         		+ "            <select name=\"cars\" id=\"cars\" multiple>\r\n"
         		+ "                <option value=\"volvo\">Volvo</option>\r\n"
         		+ "                <option value=\"saab\">Saab</option>\r\n"
         		+ "                <option value=\"opel\">Opel</option>\r\n"
         		+ "                <option value=\"audi\">Audi</option>\r\n"
         		+ "                <option value=\"seat\">Seat</option>\r\n"
         		+ "                <option value=\"peugeot\">Peugeot</option>\r\n"
         		+ "            </select>\r\n"
         		+ "        </fieldset>\r\n"
         		+ "\r\n"
         		+ "        <br>\r\n"
         		+ "        <input type=\"submit\" value=\"Enviar\" />\r\n"
         		+ "    </form>\r\n"
         		+ "\r\n"
         		+ "</body>\r\n"
         		+ "\r\n"
         		+ "</html>");

//         pw.println(Files.readString(Paths.get("src/main/webapp/index.html"), Charset.forName("UTF-8")));
         pw.close();
 	}
}
