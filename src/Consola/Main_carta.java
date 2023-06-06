package Consola;
import Logica.Carta;
import java.util.Scanner;

public class Main_carta {

	public static void main(String[] args) {
		Carta carta = new Carta();
		
		for (int i = 1; i <= 48; i++) {
			System.out.println(carta);
			 carta.siguienteCarta();
		}

	}

}
