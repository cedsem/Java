package exopoo;

public class client1R�gulierNormandie extends client1R�gulier {

	public client1R�gulierNormandie() {
		nom = "je suis un client r�gulier Normandie";
		numero = 150;
	}
	
	public String retoureInfo() {
		return " Le client R�gulier Normandie n� " + numero + " - " + nom;
	}
	
	public String retoureInfoRN() {
		return " Le client R N n� " + numero + " - " + nom;
	}
}
