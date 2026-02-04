package model;

public class Pedidos {
	private int idFlor;
	private int idCliente;
	private int idPedido;
	private int cantidad;
	private String Fecha;
	
	
	public Pedidos() {
		
	}
	public Pedidos(int flor, int cliente, int idPedido, int cantidad, String fecha) {
		
		this.idFlor = flor;
		this.idCliente = cliente;
		this.idPedido = idPedido;
		this.cantidad = cantidad;
		Fecha = fecha;
	}
	public int getFlor() {
		return idFlor;
	}
	public void setFlor(int flor) {
		this.idFlor = flor;
	}
	public int getCliente() {
		return idCliente;
	}
	public void setCliente(int cliente) {
		this.idCliente = cliente;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	@Override
	public String toString() {
		return "Pedidos \nFlor: " + idFlor + " Cliente: " + idCliente+ 
				" IdPedido: " + idPedido + " Cantidad: " + cantidad + " Fecha:" + Fecha;
	}
	
	
	
}
