package Logica;
import java.util.Scanner;

public class Empleado {
	Scanner entrada = new Scanner(System.in);

	String cedula;
	String nombre;
	int antiguedad;
	double sueldo;
	
	//Contrucotor por defecto
	public Empleado() {	
		
		System.out.println("Ingrese su cedula: ");
		cedula = entrada.next();
		System.out.println("Ingrese su nombre: ");
		nombre = entrada.next();
		System.out.println("Ingrese su antiguedad: ");
		antiguedad = entrada.nextInt();
		System.out.println("Ingrese su sueldo: ");
		sueldo = entrada.nextDouble();
		
	}
	
	//Constructor Especifico
	public Empleado (String cedula,String nombre,int antiguedad, double sueldo) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.sueldo = sueldo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return (" CEDULA: " + cedula + 
				" NOMBRE: " + nombre + 
				" ANTIGUEDAD: " + antiguedad + 
				" SUELDO: " + sueldo);
	}
	
}
