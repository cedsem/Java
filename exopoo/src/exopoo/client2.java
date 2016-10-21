package exopoo;

public class client2 {
	
	private int numero;
	private String nom;
	
	public client2() {
		nom = "inconnu";
		numero = 0;
	}

	public int getNumero() {
		return numero;
	}
	
	public void SetNumero(int num) {
		numero = num;
		}

	public String getNom() {
		return nom;
	}
	
	public void SetNom(String n) {
		nom = n;
		}

	public String retoureInfo() {
		return " Le client est " + numero + " - " + nom;
	}
}
