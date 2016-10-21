package exoFichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class FichierLecture {

	public static void main(String[] args) {
		// Lecture
		try {
			File fichier = new File ("test.txt");
			FileInputStream flux = new FileInputStream (fichier);
			
			String texte = "";
			
			int c =0;
			
			while ((c=flux.read()) !=-1){
				// Flux.read
				// System.out.println((char)c);
				texte = texte + (char)c;
			} 
			
			System.out.println(texte);
			flux.close();
			
			//Documentword
			
		//	BufferedReader flux1 = new BufferedReader(new FileReader ("C:\\Users\\semichon\\Desktop\\Documentword.docx"));
			BufferedReader flux1 = new BufferedReader(new FileReader ("Documentword.docx"));
            String line;
            while((line =flux1.readLine()) != null) {
            System.out.println(line) ;
			
			} 
			
            flux1.close();
			
		} catch (IOException ioe) {
			System.err.println(ioe);
		}
	}

}
