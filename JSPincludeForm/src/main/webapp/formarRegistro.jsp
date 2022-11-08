<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leer registro</title>
</head>
<body>

<h3>Fecha: <%=session.getAttribute("fecha")%> </h3>

<h1>Datos del formulario</h1>

<% for (Map.Entry<String, String[]> parametro : request.getParameterMap().entrySet()) { %>
<p>
	<%=parametro.getKey()%> : <%=Arrays.asList(parametro.getValue()).toString()%>
</p>
<% } %>

</body>
</html>