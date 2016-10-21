package exoarraylist;

import java.util.ArrayList;
import java.util.Vector;

public class Test_arraylist {

	public static void main(String[] args) {
		ArrayList<String> tabArrayList = new ArrayList<String>();
		
		String nom1="JF";
		String nom2="Sandrine";
		String nom3="Marie";
		String nom4="Silvie";
		String nom5="Margerite";
		
		tabArrayList.add(nom1);
		tabArrayList.add(nom2);
		tabArrayList.add(nom3);
		tabArrayList.add(nom4);
		tabArrayList.add(nom5);
		System.out.println(tabArrayList);

		for (int i = 0 ; i < tabArrayList.size() ; i++ ) {
			System.out.println(tabArrayList.get(i));
		}
		
		String nom = (String) tabArrayList.get(3);
		System.out.println("Nom4 : " + nom);
		
		// tri du tableau
		tabArrayList.sort(null);
		System.out.println(tabArrayList);
		
		tabArrayList.forEach(System.out::println);
		
		}
}
