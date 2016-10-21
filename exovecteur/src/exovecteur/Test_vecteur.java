package exovecteur;

import java.util.Vector;

public class Test_vecteur {

	public static void main(String[] args) {
		// Vecteur
	
	Vector<String> tabVector = new Vector<String>();
	
	String nom1="JF";
	String nom2="Sandrine";
	String nom3="Marie";
	String nom4="Silvie";
	String nom5="Margerite";
	
	tabVector.add(nom1);
	tabVector.add(nom2);
	tabVector.add(nom3);
	tabVector.add(nom4);
	tabVector.add(nom5);
	System.out.println(tabVector);

	for (int i = 0 ; i < tabVector.size() ; i++ ) {
		System.out.println(tabVector.elementAt(i));
	}
	
	String nom = (String) tabVector.elementAt(3);
	System.out.println("Nom4 : " + nom);
	
	// tri du tableau
	tabVector.sort(null);
	System.out.println(tabVector);
	
	tabVector.forEach(System.out::println);
		
	}

}
