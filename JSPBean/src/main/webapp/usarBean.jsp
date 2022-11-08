<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="persona" class="com.curso.Persona"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usar clase Persona</title>
</head>
<body>

<jsp:setProperty name="persona" property="nombre" value="Pepito"/>
<%-- <% persona.setNombre("Pepito"); %> --%>
<p>La persona se llama </p>
<h1><jsp:getProperty name="persona" property="nombre"/></h1>
<%-- <h1><%= persona.getNombre() %></h1> --%>

</body>
</html>