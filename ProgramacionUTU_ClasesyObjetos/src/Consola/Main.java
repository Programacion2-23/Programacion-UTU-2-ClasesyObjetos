package Consola;
import Logica.Auto;

public class Main {

	public static void main(String[] args) {
		
		Auto a1 = new Auto("Chevrolete",12.2, 10, 25000);
		System.out.print("Auto 1: " + a1.toString());
		System.out.println("");
		
		Auto a2 = new Auto("Nissan", 20.5, 20, 1050000);
		System.out.println("Auto 2: " + a2.toString());

	}

}
