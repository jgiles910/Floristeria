package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
}
