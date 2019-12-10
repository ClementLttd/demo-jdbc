package fr.diginamic.props;

import java.util.ResourceBundle;
import java.util.Set;

public class TestConfiguration {

	public static void main(String[] args) {

		ResourceBundle monFichier = ResourceBundle.getBundle("fichier");
		String driverName = monFichier.getString("database.driver");

		System.out.println(driverName);

		Set<String> keys = monFichier.keySet();
		for (String key : keys) {
			driverName = monFichier.getString(key);
			System.out.println(driverName);
		}
			
	}
}
