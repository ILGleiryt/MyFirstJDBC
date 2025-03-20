package ru.ilya.code.ApplicationJDBC;

import java.sql.*;

/**
 * To do: Вынести логику подключения к бд в класс DbCon, a сами настройки спрятать в properties и не забыть внести их в .gitignore
 *
 */
public class Main {
	public static final String User = "User";
	public static final String url = "jdbc:mysql://localhost:3306/workers";
	public static final String Password = "246810";
	
    public static void main( String[] args ) {
    	try(Connection conection =  DriverManager.getConnection(url, User, Password);) {
    		
    		String sql = "CREATE TABLE work (" +
    				"id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100) NOT NULL )";
    	
    		Statement statement = conection.createStatement();
    		statement.executeUpdate(sql);
    		
    		System.out.println("Connection is open");
    	} catch(SQLException ex) {
    		System.out.print("Sql get wrong" + ex.getMessage());
    	} 
    }
}
