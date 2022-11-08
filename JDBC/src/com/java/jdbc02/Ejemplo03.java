package com.java.jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ejemplo03 {

	public static void main(String[] args) {

		String cadena = "jdbc:mysql://localhost:3306/tienda";
		String user = "root", pwd = "root";
		String query = "INSERT INTO `tienda`.`articulos` (`nombre`, `precio`, `fabricante`) VALUES ('pimienta', ?, '6');";

		try (Connection conexion = DriverManager.getConnection(cadena, user, pwd);
				PreparedStatement sentencia = conexion.prepareStatement(query)) {
			
			sentencia.setInt(1, 120);
			sentencia.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}