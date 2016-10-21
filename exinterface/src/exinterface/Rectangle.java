package exinterface;

public class Rectangle implements Forme {
	
	int largeur;
	int longueur;
	
	public Rectangle(int x, int y){
		this.largeur = x;
		this.longueur = y;		
	}
	
	public void affiche() {
		System.out.println("rectangle " + longueur + "x" + largeur);	
	}
	
	public double surface() {
		return this.longueur * this.largeur;	
	}
}
