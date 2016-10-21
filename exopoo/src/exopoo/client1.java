package exopoo;

public class client1 {
	
	int numero;
	String nom;
	
	public client1() {
		nom = "inconnu";
		numero = 0;
	}

	public String retoureInfo() {
		return " Le client n° " + numero + " - " + nom;
	}
}
