package fr.diginamic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {

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
			int curseur2 = state.executeUpdate("UPDATE fournisseur SET NOM='La Maison des Peintures' WHERE NOM='La Maison de la Peinture'");
		state.close();
		connection.close();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}

	}

}
