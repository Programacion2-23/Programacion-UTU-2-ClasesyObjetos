package Consola;
import Logica.Empleado_2B;
import java.util.Scanner;

public class Main_Empleado2B {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su cedula: ");
		String cedula = entrada.next();
		System.out.println("Ingrese su nombre: ");
		String nombre = entrada.next();
		System.out.println("Ingrese su antiguedad: ");
		int antiguedad = entrada.nextInt();
		System.out.println("Ingrese su sueldo: ");
		double sueldo = entrada.nextDouble();
		
		Empleado_2B empleado2B =  new Empleado_2B(cedula,nombre,antiguedad,sueldo);
		System.out.println(empleado2B.toString());
		

	}

}
