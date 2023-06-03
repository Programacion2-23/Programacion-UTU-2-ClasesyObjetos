package Consola;
import Logica.Electrodomesticos;
import java.util.Scanner;

public class Main_Electrodomesticos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Electrodomesticos e1 = new Electrodomesticos();
		System.out.println("Electrodomestico numero 1");
		System.out.println("-----------------");
		e1.setNombre("Heladera");
		e1.setMarca("Panavox");
		e1.setConsumo(4.5);
		
		System.out.println(e1.toString());
		System.out.println("-----------------");
		
		System.out.println("Ingrese el nombre del electrodomestico: ");
		String nombre = entrada.next();
		
		System.out.println("Ingrese la marca del electrodomestico: ");
		String marca = entrada.next();
		
		System.out.println("Ingrese el consumo del electrodomestico: ");
		double consumo = entrada.nextDouble();	
		
		
		Electrodomesticos e2 = new Electrodomesticos(nombre,marca,consumo);
		e2.mostrarElectroDos();
		
		

	}

}
