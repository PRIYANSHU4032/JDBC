package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbsconnection {
   static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
   static final String USER = "root";
   static final String PASS = "8539909495";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "insert into REGISTRATION values (110,'sakshi','kuttu',20)"; 
                   

         stmt.executeUpdate(sql);
         System.out.println("Inserted table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}