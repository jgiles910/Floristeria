package controller;
import dao.ClientesDao;
public class ClientesController {

	private ClientesDao dao; 
	
	public ClientesController(){
		
		dao = new ClientesDao();
	}
}
