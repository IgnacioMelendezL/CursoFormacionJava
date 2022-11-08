<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html lang="en">

<head>
<title></title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
	<h1>Datos del formulario</h1>

	<%
	for (Map.Entry<String, String[]> parametro : request.getParameterMap().entrySet()) {
	%>
	<p>
		<%=parametro.getKey()%> : <%=Arrays.asList(parametro.getValue()).toString()%>
	</p>
	<%
	}
	%>

</body>