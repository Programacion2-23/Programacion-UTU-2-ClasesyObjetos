package Consola;
import Logica.Empleado;
import java.util.Scanner;

public class Main_Empleado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//EMPLEADO 1
		Empleado e1 = new Empleado("111", "Pedro", 4, 25000);
		System.out.println(e1.toString());
		System.out.println("");
		
		//EMPLEADO 2
		Empleado e2 = new Empleado();
		System.out.println(e2.toString());

	}

}
