package exinterface;


public class Cercle implements Forme {
	
	double rayon;
		
	public Cercle(double r){
		this.rayon = r;
	}
	
	public void affiche() {
		System.out.println("cercle rayon " + rayon);	
	}
	
	public double surface() {
		return this.rayon * this.rayon * 3.14;	
	}
}