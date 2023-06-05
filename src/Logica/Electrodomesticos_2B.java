package Logica;
import java.util.Scanner;

public class Electrodomesticos_2B {

	Scanner entrada = new Scanner(System.in); 

	String nombre;
	String marca;
	double consumo;
	double costo;
	
	//CONSTRUCTOR POR DEFECTO
	public Electrodomesticos_2B() {	
		
		nombre = "Microhondas";
		marca = "Panavox";
		consumo = 23.5;
		costo = 24000;
	}
	
	//CONSTRUCOR ESPECIFICO
	public Electrodomesticos_2B(String nombre, String marca, double consumo, double costo) {
		this.nombre = nombre;
		this.marca = marca;
		this.consumo = consumo;
		this.costo = costo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	public void mostrarElectroDos() {
		System.out.println("----------------------------");
		System.out.println("Electrodomestico numero 2");
		System.out.println("---------------------");
		System.out.println("NOMBRE: " + nombre);
		System.out.println("MARCA: " + marca);
		System.out.println("CONSUMO: " + consumo);
		System.out.println("COSTO: " + precioVenta(costo));
	}
	
	double precioVenta(double costo) {
		return costo*1.20;
	}
	
	@Override
	public String toString() {
		return (" NOMBRE: " + nombre +
				" MARCA: " + marca + 
				" CONSUMO: " + consumo +
				" COSTO: " + precioVenta(costo));
	}
	
}
