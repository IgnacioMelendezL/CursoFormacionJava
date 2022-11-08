package com.java.jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo01 {

	public static void main(String[] args) {

		// Resgistrar la clase
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String cadena = "jdbc:mysql://localhost:3306/tienda";
			String user = "root", pwd = "root";

			Connection conexion = DriverManager.getConnection(cadena, user, pwd);

			Statement sentencia = conexion.createStatement();
			String sql = "INSERT INTO `tienda`.`articulos` (`codigo`, `nombre`, `precio`, `fabricante`) VALUES ('13', 'nueces', '33', '4');";

			sentencia.execute(sql);

			sentencia.close();
			conexion.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
