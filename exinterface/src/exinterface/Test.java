package exinterface;

public class Test {

	public static void main(String[] args) {
		// Test
		
		Rectangle Rectangle_cedric = new Rectangle(4,5);
		
		Rectangle_cedric.affiche();
		
		double surf = Rectangle_cedric.surface();
		
		System.out.println("La surface du rectangle = " + surf);
		
		Cercle Cercle_cedric = new Cercle(100);
		
		Cercle_cedric.affiche();

		surf = Cercle_cedric.surface();
		
		System.out.println("La surface du cercle = " + surf);
		
		
		System.out.println(Cercle_cedric instanceof Cercle);
		
		System.out.println(Rectangle_cedric instanceof Forme);
	}

}
