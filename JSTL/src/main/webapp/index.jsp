<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver form</title>
</head>
<body>

	<c:out value="Nombre: ${param.nombre}" /><br>
	<c:out value="Apellidos: ${param.apellidos}" /><br><br>
	
	<c:out value="Pilates: ${param.pilates}" /><br>
	<c:out value="Yoga: ${param.yoga}" /><br><br>
	
	<c:out value="Color: ${param.fav_color}" /><br><br>
	
	<c:out value="Coches: ${param.cars}" /><br>
	
	<c:forEach var="i" begin="1" end="10" step="1">
		${param.num*i} <br>
	</c:forEach>
</body>
</html>