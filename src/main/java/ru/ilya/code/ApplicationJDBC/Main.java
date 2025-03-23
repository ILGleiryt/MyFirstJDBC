package ru.ilya.code.ApplicationJDBC;

import java.sql.*;

/**
 * To do: Вынести логику подключения к бд в класс DbCon, a сами настройки спрятать в properties и не забыть внести их в .gitignore
 *
 */
public class Main {

	
    public static void main( String[] args ) {
    	DbConnection dbConnect = new DbConnection();
    	Connection connection = dbConnect.connect();
    	
    	if (connection != null) {
            try {
                connection.close();
                System.out.println("Соединение закрыто.");
            } catch (SQLException e) {
                System.out.println("Ошибка при закрытии соединения: " + e.getMessage());
            }
        }
    }
}
