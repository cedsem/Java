package exopoo;

public class client1RégulierNormandie extends client1Régulier {

	public client1RégulierNormandie() {
		nom = "je suis un client régulier Normandie";
		numero = 150;
	}
	
	public String retoureInfo() {
		return " Le client Régulier Normandie n° " + numero + " - " + nom;
	}
	
	public String retoureInfoRN() {
		return " Le client R N n° " + numero + " - " + nom;
	}
}
