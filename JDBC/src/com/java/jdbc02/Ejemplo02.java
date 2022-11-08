package com.java.jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo02 {

	public static void main(String[] args) {

		String cadena = "jdbc:mysql://localhost:3306/tienda";
		String user = "root", pwd = "root";
		String query = "SELECT * FROM articulos";

		try (Connection conexion = DriverManager.getConnection(cadena, user, pwd);
				Statement sentencia = conexion.createStatement();
				ResultSet rs = sentencia.executeQuery(query)) {

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

}
