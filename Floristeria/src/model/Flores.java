package model;

public class Flores {

	
	private int idFlor;
	private String nombre;
	private String color;
	private double 	precio;
	
	
	public Flores() {
		
	}
	
	public Flores(int id, String nombre, String color, double precio) {
		
		this.idFlor = id;
		this.nombre = nombre;
		this.color = color;
		this.precio = precio;
	}
	public int getId() {
		return idFlor;
	}
	public void setId(int id) {
		this.idFlor = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Flores\n ID: " + idFlor + " Nombre: " + nombre + " Color: " + color + " Precio: " + precio;
	}
	
}
