package fr.diginamic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta", "root", "");
			Statement state = connection.createStatement();
			int curseur3 = state.executeUpdate("DELETE FROM fournisseur WHERE NOM='La Maison des Peintures'");
		
		state.close();
		connection.close();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}

	}

}
