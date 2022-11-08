<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
</head>
<body>
<h1>¡Error!</h1>
<p>La combinación <%= request.getParameter("nombre") %> y <%= request.getParameter("password") %> no es válida </p>
</body>
</html>