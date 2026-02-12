package vista;

import java.sql.SQLException;
import controller.FloristeriaController;

public class Aplicacion {

	public static void main(String[] args) throws SQLException {

		FloristeriaController controller = new FloristeriaController();

		controller.menu();

	}

}
