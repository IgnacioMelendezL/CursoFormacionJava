<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bucle jsp</title>
<style>
td {
	padding: 15px;
	text-align: center;
}
</style>
</head>
<body>
	<h1>Tablas de multiplicar del 1 al 10</h1>
	<table border=1>
		<%
		for (int i = 1; i <= 10; ++i) {
		%>
		<tr>
			<%
			for (int j = 1; j <= 10; ++j) {
			%>
			<td><%=i * j%></td>
			<%
			}
			%>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>