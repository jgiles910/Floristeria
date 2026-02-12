package dao;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Clientes;

public class ClientesDao {

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

	public ArrayList<Clientes> getClientes() throws SQLException {

		ArrayList<Clientes> listaClientes = new ArrayList<Clientes>();

		String sqlConsulta = "Select * from clientes";

		try (Connection con = getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sqlConsulta);) {

			while (rs.next()) {
				listaClientes.add(new Clientes(rs.getInt("id_cliente"), rs.getString("nombre"),
						rs.getString("telefono"), rs.getString("email")));
			}

			return listaClientes;
		}
	}

}
