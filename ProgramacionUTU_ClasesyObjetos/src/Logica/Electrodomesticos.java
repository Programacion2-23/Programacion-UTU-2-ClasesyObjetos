package Logica;
import java.util.Scanner;

public class Electrodomesticos {
	Scanner entrada = new Scanner(System.in); 

	String nombre;
	String marca;
	double consumo;
	
	//CONSTRUCTOR POR DEFECTO
	public Electrodomesticos() {
		
		System.out.println("Ingrese el nombre del electrodomestico: ");
		nombre = entrada.next();
		
		System.out.println("Ingrese la marca del electrodomestico: ");
		marca = entrada.next();
		
		System.out.println("Ingrese el consumo del electrodomestico: ");
		consumo = entrada.nextDouble();		
		
	}
	
	//CONSTRUCOR ESPECIFICO
	public Electrodomesticos(String nombre, String marca, double consumo) {
		this.nombre = nombre;
		this.marca = marca;
		this.consumo = consumo;
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
	}
	
	@Override
	public String toString() {
		return (" NOMBRE: " + nombre +
				" MARCA: " + marca + 
				" CONSUMO: " + consumo);
	}
	
}
