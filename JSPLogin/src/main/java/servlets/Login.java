package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Perfil;
import service.ValidacionService;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Perfil perfil = ValidacionService.validar(request.getParameter("nombre"), request.getParameter("password"));
		
		if(perfil != null) {
			request.getSession(true).setAttribute("perfil", perfil);
			RequestDispatcher dispatch = request.getRequestDispatcher("entrada.jsp");
			dispatch.forward(request, response);
		} else {
			RequestDispatcher dispatch = request.getRequestDispatcher("error.jsp");
			dispatch.forward(request, response);
		}
	}

}
