package com.curso;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet001 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private int peticiones;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<!DOCTYPE html>\r\n"
                + "<html lang=\"en\">\r\n"
                + "    <head>\r\n"
                + "        <title></title>\r\n"
                + "        <meta charset=\"UTF-8\">\r\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
                + "        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n"
                + "    </head>\r\n"
                + "    <body>\r\n"
                + "    \r\n");

        for (int i = 0; i < 10; ++i)
            pw.println("<p>Hola " + i + " desde un servlet</p>");

        pw.println("<form>\r\n"
                + "    <label for=\"name\">Nombre:</label>\r\n"
                + "    <input id=\"name\" type=\"text\" name=\"nombre\" />\r\n"
                + "    <label for=\"surname\">Apellidos</label>\r\n"
                + "    <input id=\"surname\" type=\"text\" name=\"apellidos\" />\r\n"
                + "    <input type=\"submit\" value=\"Enviar\" />\r\n"
                + "</form>");

        for (Map.Entry<String, String[]> parametro : request.getParameterMap().entrySet()) {
            pw.println("<p>" + parametro.getKey() + "/" + Arrays.asList(parametro.getValue()).toString() + "</p>");
        }

        pw.println(peticiones++);

        pw.println("    </body>\r\n"
                + "</html>");

        pw.close();

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        peticiones = Integer.parseInt(getInitParameter("inicio"));
    }

}