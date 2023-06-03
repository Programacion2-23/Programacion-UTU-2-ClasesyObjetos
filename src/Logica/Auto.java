package Logica;

public class Auto {
	
	String marca;
	double velMax;
	int potencia;
	double precio;
	
	
	public Auto () {	
	}
	
	public Auto (String marca,double velMax, int potencia,double precio) {
		this.marca = marca;
		this.velMax = velMax;
		this.potencia = potencia;
		this.precio = precio;
	}
	
	//SETTERS
	//GETTERS

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return ("Marca: " + marca +
				" VelocidadMaxima: " + velMax + 
				" Potencia: " + potencia + 
				" Precio: " + precio);
	}
	
	
}
