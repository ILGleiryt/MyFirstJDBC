package ru.ilya.code.ApplicationJDBC;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbConfig {
	private Properties properties;
	
	public DbConfig() {
		properties = new Properties();
		
		try(InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
			properties.load(input);
		}
		catch(IOException io) {
			System.out.println("Error in IO");
		}
	}
	
	public String getUrl() {
		return properties.getProperty("db.url");
	}
	
	public String getUsername() {
		return properties.getProperty("db.username");
	}
	
	public String getPassword() {
		return properties.getProperty("db.password");
	}
}
