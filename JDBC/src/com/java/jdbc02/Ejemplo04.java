package com.java.jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejemplo04 {

	public static void main(String[] args) {

		String cadena = "jdbc:mysql://localhost:3306/tienda";
		String user = "root", pwd = "root";
		String query = "SELECT * FROM articulos WHERE precio >= ?";

		try (Connection conexion = DriverManager.getConnection(cadena, user, pwd);
				PreparedStatement sentencia = generarConsultaParametrizada(query, 120, conexion);
				ResultSet rs = sentencia.executeQuery()) {

			while (rs.next()) {
				System.out.print(rs.getInt("codigo") + "\t");
				System.out.print(rs.getString("nombre") + "\t");
				System.out.print(rs.getString("precio") + "\t");
				System.out.println(rs.getInt("fabricante") + "\t");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static PreparedStatement generarConsultaParametrizada(String query, int precio, Connection conexion)
			throws SQLException {

		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setInt(1, precio);
		return sentencia;
	}

}