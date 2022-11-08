<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="models.Perfil" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Correcto</title>
</head>
<body>
<h1>¡Bienvenido!</h1>
<% Perfil perfil = (Perfil)session.getAttribute("perfil"); %>
<p>Usuario: <%= perfil.getNombre() %></p>
<p>Mail: <%= perfil.getCorreo() %></p>
<p>Edad: <%= perfil.getEdad() %></p>
</body>
</html>