package Consola;
import Logica.Articulos;
import Logica.Fecha;

public class Main_articulo {

	public static void main(String[] args) {
		
		Fecha f1 = new Fecha(4,8,2004);
		
		Articulos articulos = new Articulos(4,"Helado", 300,f1);
		System.out.println(articulos.toString());
		
		

	}

}
