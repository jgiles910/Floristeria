package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Flores;

public class FloresDao {

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/floristeria";//
		String usuario = "root";
		String clave = "";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, usuario, clave);
			System.out.println("Conectado a la base de datos");
		} catch (SQLException e) {
			System.err.println("Error al conectar: " + e.getMessage());
		}
		return con;
	}

	// Calcular y mostrar el precio medio de las flores.
	public double calcularPrecioMedio() throws SQLException {
		String sqlConsulta = "Select AVG(precio) as PrecioMedio from flores";

		double precioMedio = 0;

		try (Connection con = getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sqlConsulta)) {

			while (rs.next()) {
				precioMedio = rs.getDouble("PrecioMedio");
			}
		}

		return precioMedio;
	}

	public ArrayList<Flores> getFlores() throws SQLException {

		ArrayList<Flores> listaFlores = new ArrayList<Flores>();

		String sqlConsulta = "Select * from flores";

		try (Connection con = getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sqlConsulta);) {

			while (rs.next()) {
				listaFlores.add(new Flores(rs.getInt("id_flor"), rs.getString("nombre"), rs.getString("color"),
						rs.getDouble("precio")));
			}

			return listaFlores;
		}
	}
}
