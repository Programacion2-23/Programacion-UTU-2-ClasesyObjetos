package Logica;
import java.util.Scanner;

public class Empleado_2B {
	
	Scanner entrada = new Scanner(System.in);

	private String cedula;
	private String nombre;
	private int antiguedad;
	private double sueldo; 
	
	//Contrucotor por defecto
	public Empleado_2B() {		
	}
	
	//Constructor Especifico
	public Empleado_2B (String cedula,String nombre,int antiguedad, double sueldo) {
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
	
	double sueldoAnual(double sueldo) {
		return sueldo*12;
	}
	
	double presentismo(double sueldo) {
		sueldo = sueldoAnual(sueldo)*1.10;
		return sueldo;
	}
	
	
	
	@Override
	public String toString() {
		return (" CEDULA: " + cedula + 
				" NOMBRE: " + nombre + 
				" ANTIGUEDAD: " + antiguedad + 
				" SUELDO: " + sueldo + 
				" SUELDO ANUAL: " + presentismo(sueldo));
	}

}
