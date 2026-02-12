package controller;

import dao.ClientesDao;
import dao.FloresDao;
import dao.PedidosDao;
import model.Clientes;
import model.Flores;
import model.Pedidos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class FloristeriaController {

	// 1. declaro todos  los objetos del paquete dao para acceder a sus metodos.
	private ClientesDao clientesDao;
	private FloresDao floresDao;
	private PedidosDao pedidosDao;
	Scanner sc = new Scanner(System.in);

	public FloristeriaController() {
		// 2. Instanciacion e Inicializacion
		// En cuanto el Main haga "new EquipoController()",
		// el Controller fabrica su propia herramienta de base de datos.
		clientesDao = new ClientesDao();
		floresDao = new FloresDao();
		pedidosDao = new PedidosDao();
	}

	//metodo para mostrar el menu, 
	public void menu() throws SQLException {
		int opcion = 0;

		do {
			System.out.println("\n====== FLORISTERIA ======"); 
			System.out.println("1. Ver clientes"); 
			System.out.println("2. Mostrar flores");   
			System.out.println("3. Mostrar pedidos"); 
			System.out.println("4. Calcular y mostrar el precio medio de las flores");
			System.out.println("5. Salir"); 
	

			opcion  = sc.nextInt();  

		  switch (opcion) {
				case 1:
						verClientes(); 
						break;
					case 2: 
						mostrarFlores(); 
						break; 
					case 3:
						mostrarPedidos();
						break;
					case 4:
						precioMedioFlores(); 
						break;
					case 5:
						System.out.println("has salido.");
						break;
					default:
							System.out.println( "introduce un valor valido");
		  }
		  			
		}  while ( opcion != 5);
	}

	
	// aqui empiezan todos los metodos  
	
	//1. Metodo para visualizar clientes. ----------------------- 
	private void verClientes() throws SQLException {
		//Lo que me devuelve el metodo lo meto en el arraylist listaCliente 
		ArrayList<Clientes> listaCliente = clientesDao.getClientes(); 
		for (Clientes c : listaCliente) {
			System.out.println(c.getId_Cliente() + " - " + c.getNombre() + " | Tel: " + c.getTelefono() + " | Email: " 
					+ c.getEmail()); 
		}
	}

	// 2. Metodo para mostrar las flores -----------------------
	private void mostrarFlores() throws SQLException { 

		
		// meto lo que me devuelve el dao a un arraylist de flores 
		ArrayList<Flores> listaFlor = floresDao.getFlores();
		for (Flores f : listaFlor) {
			System.out.println(f.getId()  + " - " + f.getNombre() + " | color: "  + f.getColor() + " | precio: "
					+ f.getPrecio() +  "€");
		}

	}

	// 3.  mostrar los pedidos -----------------------
	private void mostrarPedidos() throws SQLException { 

		// metodo lo inserto en el arraylist de pedidos 
		ArrayList<Pedidos> listaPedidos = pedidosDao.getPedidos(); 
		for   (Pedidos p : listaPedidos) { 
			System.out.println("pedido id: " + p.getIdPedido()+ " | cliente id: " +  p.getCliente() +" | flor Id: "
					+ p.getFlor()  + " | cantidad: "+  p.getCantidad()  +   " | fecha: " +  p.getFecha());
			
			
		}

	}

	// 4. calcular media del precio de las flores -----------------------
	private void precioMedioFlores() throws SQLException {
 
		// Resultado del metodo lo guradoo en una variable y lo muestro 
		double  media = floresDao.calcularPrecioMedio(); 
		
		System.out.println("precio medio:  " + media+ "€ ");

	}
}
