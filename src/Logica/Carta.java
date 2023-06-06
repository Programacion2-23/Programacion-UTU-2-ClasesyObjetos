package Logica;

public class Carta {

	private int numero;
	private String palo;
	
	public Carta() {
		numero = 1;
		palo = "oro";
	}
	
	public Carta(int numero,String palo) {
		
		if (numero >= 1 && numero <= 12) {
			this.numero = numero;
		} 
		
		if (palo.equals("basto") || palo.equals("copa") || palo.equals("espada") || palo.equals("oro")) {
			this.palo = palo;
		}
		
		switch (palo) {
        case "basto":
            palo = "copa";
            break;
        case "copa":
            palo = "espada";
            break;
        case "espada":
            palo = "oro";
            break;
        case "oro":
            palo = "basto";
            break;
    }
		
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	public void siguienteCarta() {
		if (numero == 12) {
			numero = 1;
		} else {
			numero++;
		}
	}
	
	
	@Override
	public String toString() {
		return numero + " de " + palo;
	}
	
}
