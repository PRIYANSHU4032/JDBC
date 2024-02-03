package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Dbconnection {
	public void connectDatabase() {
		String url = "jdbc:mysql://localhost:3306/mysql";
        String username = "root";
        String password = "8539909495";

        // Attempt to establish a connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
        	System.out.println("Connected to database");        	
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
	
}


