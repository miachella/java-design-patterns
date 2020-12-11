package fr.diginamic.singleton.conf;

import java.util.ResourceBundle;

public class ConfigSingleton {
	
	public static ConfigSingleton instance = new ConfigSingleton();
	ResourceBundle fichier;

	private ConfigSingleton() {
		this.fichier = ResourceBundle.getBundle("configuration");
	}

	public static ConfigSingleton getInstance() {
		return instance;
	}
	public String getValue(String key) {
		return this.fichier.getString(key);
	}

}
