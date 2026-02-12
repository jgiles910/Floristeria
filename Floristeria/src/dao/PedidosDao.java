package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Clientes;
import model.Pedidos;

public class PedidosDao {

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

	public ArrayList<Pedidos> getPedidos() throws SQLException {

		ArrayList<Pedidos> listaPedidos = new ArrayList<Pedidos>();

		String sqlConsulta = "Select * from pedidos";

		try (Connection con = getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sqlConsulta);) {

			while (rs.next()) {
				listaPedidos.add(new Pedidos(rs.getInt("id_pedido"), rs.getInt("id_cliente"), rs.getInt("id_flor"),
						rs.getInt("cantidad"), rs.getString("fecha")));
			}

			return listaPedidos;
		}
	}
}
