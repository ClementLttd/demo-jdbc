package fr.diginamic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.diginamic.jdbc.entites.Fournisseur;

public class TestSelect {

		public List<Fournisseur> extraire(){
			ArrayList<Fournisseur> fournisseur = new ArrayList<>();
	
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta", "root", "");
			Statement state = connection.createStatement();
			ResultSet curseur4 = state.executeQuery("SELECT * FROM fournisseur");

			while (curseur4.next()) {
				int id = curseur4.getInt("ID");
				String nom = curseur4.getString("NOM");

				System.out.println(id + " / " + nom);
			}

			curseur4.close();
			state.close();
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return fournisseur;

	}

}
