package exoJDBC;

//import java.sql.Connetion;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;

public class testsql {

	public static void main(String[] args) {
		// Test lecture table MySQL
		Connection connex = null;
		String url = "jdbc:mysql://localhost:3306/sakila";
		//String url = "C:/Program Files/MySQL/MySQL Workbench 6.3 CE/jdbc:mysql://localhost/sakila";
		
		try	{
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//System.out.println
			Class.forName("com.mysql.jdbc.Driver");
			
			connex = DriverManager.getConnection(url, "cse", "cse1");
			
			connex.setAutoCommit(false);
			
			// Création de requête:
			Statement requete = connex.createStatement();
			
			// Exécution de la requête
			ResultSet resultat = requete.executeQuery("select first_name, last_name, last_update from actor;");
			// Parcours de l'ensemble résultat
			while (resultat.next()) {
				System.out.println(   resultat.getString("first_name") + "-"
									+ resultat.getString("last_name") + "-"
									+ resultat.getDate("last_update") );
			}	
			
			System.out.println( "");
			System.out.println( "---- table City ----");
			System.out.println( "");
			
			// Exécution de la requête
			ResultSet rsultat_city = requete.executeQuery("select city_id, city, country_id, last_update from city where city = 'Papeete';");
			// Parcours de l'ensemble résultat
			while (rsultat_city.next()) {
				System.out.println(   rsultat_city.getString("city_id") + "-"
									+ rsultat_city.getString("city") + "-"
									+ rsultat_city.getString("country_id") + "-"
									+ rsultat_city.getDate("last_update") );
			} 
			
			connex.commit();
			
			connex.close(); 
			
		}
		catch (ClassNotFoundException e) {
			System.out.println("Erreur charg. Driver " + e.getMessage());
		}
		catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage() + " Annulation des màj ");
			try
			{
				connex.rollback();
				connex.close();
			}
			catch (SQLException e1) {
				System.out.println("Erreur SQL imbr. " + e.getMessage());
			}
		}
	}
}
