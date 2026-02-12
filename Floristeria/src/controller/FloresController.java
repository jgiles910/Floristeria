package controller;
import dao.FloresDao;

public class FloresController {

	// 1. declaro el objeto flores dao para poder usar sus metodos, pero aun esta vacio.
	private FloresDao dao;
	
	  public FloresController() {
	        // 2. INSTANCIACIÓN E INICIALIZACIÓN:
	        // En cuanto el Main haga "new EquipoController()",
	        // el *Controlador* fabrica su propia herramienta de base de datos.
	        dao = new FloresDao(); 
	    }
	  
}
