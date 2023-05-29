package Consola;
import Logica.Electrodomesticos;

public class Main_Electrodomesticos {

	public static void main(String[] args) {
		
		Electrodomesticos e1 = new Electrodomesticos();
		System.out.println("Electrodomestico numero 1");
		System.out.println("-----------------");
		e1.setNombre("Heladera");
		e1.setMarca("Panavox");
		e1.setConsumo(4.5);
		
		System.out.println(e1.toString());
		System.out.println("-----------------");
		
		
		Electrodomesticos e2 = new Electrodomesticos();
		e2.mostrarElectroDos();
		
		

	}

}
