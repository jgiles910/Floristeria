package model;

public class Clientes {

	private int idCliente;
	private String nombre;
	private String telefono;
	private String email;
	
	
	public Clientes() {
	
	}
	
	public Clientes(int id_Cliente, String nombre, String telefono, String email) {
		
		this.idCliente = id_Cliente;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}
	public int getId_Cliente() {
		return idCliente;
	}
	public void setId_Cliente(int id_Cliente) {
		this.idCliente = id_Cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Clientes\n ClienteID: " + idCliente + " Nombre: " + nombre + " Telefono: " + telefono + " Email: "
				+ email;
	}
	
	
}
