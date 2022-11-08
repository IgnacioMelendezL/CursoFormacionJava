<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cursos</title>
</head>
<body>
<%
String curso1 = "chino";
String curso2 = "japones";
String curso3 = "esperanto";
List<String> listaCursos = new ArrayList<String>();
listaCursos.add(curso1);
listaCursos.add(curso2);
listaCursos.add(curso3);
%>
<h1>Bucle que muestra los elementos de la lista de cursos</h1>
Cursos ordenados
<ol>
<% for(String curso : listaCursos) { %>
	<li> <%= curso %></li>
	<% } %>
</ol>

Cursos no ordenados
<ul>
<% for(String curso : listaCursos) { %>
	<li> <%= curso %></li>
	<% } %>
</ul>

<dl>
  <dt>Cursos definidos</dt>
<% for(String curso : listaCursos) { %>
	<dd> <%= curso %></dd>
	<% } %>
</dl>

<table border=1px> <caption>Cursos en tabla</caption>
<% for(String curso : listaCursos) { %>
	<tr><td> <%= curso %></td></tr>
	<% } %>
</table>
</body>
</html>