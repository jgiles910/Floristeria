package controller;
import dao.PedidosDao;
public class PedidosController {
	
	private PedidosDao dao; 
	
	public PedidosController() {
		
		dao = new PedidosDao();
	}
}
