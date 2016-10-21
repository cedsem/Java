package exopoo;



public class TestClient {

	public static void main(String[] args) {
		// Manipulation d'un entier
		
		int x;
		x = 100;
		x = x + 200;
		System.out.println("La valeur de x : "+ x);
		
		// Manipulation d'un client1
		client1 a;
		a = new client1();
		String info = a.retoureInfo();
		System.out.println(info);
		
		client1 b;
		b = new client1();
		b.nom = "Cédric";
		b.numero = 1;
		info = b.retoureInfo();
		System.out.println(info);
		
		client1 c;
		c = new client1();
		c.nom = "Julie";
		c.numero = 2;
		info = c.retoureInfo();
		System.out.println(info);
		
		client2 d;
		d = new client2();
		d.SetNom("Marie");
		d.SetNumero(3);
		
		System.out.println(" Le Numero de client2 est " + d.getNumero());
		System.out.println(" Le Nom    de client2 est " + d.getNom());
		
		info = d.retoureInfo();
		System.out.println(info);
		
		client1Régulier e;
		e = new client1Régulier();
		e.numero=33;
		e.nom="Silvie cliente régulière";
		info = e.retoureInfo();
		System.out.println(info);
		
		client1RégulierNormandie f;
		f = new client1RégulierNormandie();
		info = f.retoureInfo();
		System.out.println(info);
		info = f.retoureInfoRN();
		System.out.println(info);
		
		System.out.println(f instanceof client1Régulier);
	}

}
