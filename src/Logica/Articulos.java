package Logica;

public class Articulos {
	
	private int codigo;
	private String nombre;
	private double precioCuesta;
	private Fecha fechaVenc;

	
	public Articulos() {
		
	}
	
	public Articulos(int codigo,String nombre, double precioCuesta,Fecha fechaVenc) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioCuesta = precioCuesta;
		this.fechaVenc = fechaVenc;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioCosta() {
		return precioCuesta;
	}

	public void setPrecioCosta(double precioCosta) {
		this.precioCuesta = precioCosta;
	}

	public Fecha getFechaVenc() {
		return fechaVenc;
	}

	public void setFechaVenc(Fecha fechaVenc) {
		this.fechaVenc = fechaVenc;
	}
	
	public double precioVenta() {
		return precioCuesta * 1.20;
	}
	
	@Override
	public String toString() {
		return ("Codigo: " + codigo + " Nombre: " + nombre + " precio: " + precioVenta() + 
				fechaVenc);
	}
	
	
}
