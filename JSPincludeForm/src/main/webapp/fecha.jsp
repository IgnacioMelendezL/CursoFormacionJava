<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Date date = new Date();
session.setAttribute("fecha", date.toString());
%>
<h3>Fecha: <%= date.toString() %> </h3>

<%@ include file="registro.html" %>

</body>
</html>