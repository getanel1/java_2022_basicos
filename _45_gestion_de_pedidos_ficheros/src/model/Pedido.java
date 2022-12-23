package model;

public class Pedido {

	  private String producto;
	  private String fecha;
	  private double precio;
	public Pedido(String producto, String fecha, double precio) {
		super();
		this.producto = producto;
		this.fecha = fecha;
		this.precio = precio;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	  
		  
	 

	  } 

