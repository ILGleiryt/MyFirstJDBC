package ru.ilya.code.ApplicationJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private DbConfig dbConfig;
	
	public DbConnection() {
		dbConfig = new DbConfig();
	}
	
	public Connection connect() {
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(dbConfig.getUrl(), dbConfig.getUsername(), dbConfig.getPassword());
			
			System.out.println("Connection to database succesfull");
			
		} catch(SQLException ex) {
			System.out.println("SQL has trouble");
		}
		return connection;
	}
}
