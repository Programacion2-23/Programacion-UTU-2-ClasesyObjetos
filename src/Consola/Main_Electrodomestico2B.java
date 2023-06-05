package Consola;
import Logica.Electrodomesticos_2B;
import java.util.Scanner;

public class Main_Electrodomestico2B {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Electrodomesticos_2B e1B = new Electrodomesticos_2B();
		System.out.println(e1B.toString());
		
		System.out.println("Ingrese el nombre del electrodomesticos: ");
		String nombre = entrada.next();
		
		System.out.println("Ingrese la marca del electrodomestico: ");
		String marca = entrada.next();
		
		System.out.println("Ingrese el consumo del electrodomestico: ");
		double consumo = entrada.nextDouble();
		
		System.out.println("Ingrese el costo del electrodomestico: ");
		double costo = entrada.nextDouble();
		
		Electrodomesticos_2B e2B = new Electrodomesticos_2B(nombre,marca,consumo,costo);
		e2B.mostrarElectroDos();
	}

}
