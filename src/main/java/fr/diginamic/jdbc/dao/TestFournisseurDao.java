package fr.diginamic.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import fr.diginamic.jdbc.entites.Fournisseur;

public class TestFournisseurDao {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta", "root", "");
			Statement stat = connection.createStatement();
			int curseur = stat.executeUpdate("INSERT INTO fournisseur (ID,NOM) VALUES (4, 'L''Espace Création')");
			
			System.out.println(curseur);
			
			stat.close();
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		

	}

}
