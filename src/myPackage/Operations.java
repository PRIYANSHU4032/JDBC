package myPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Operations {

    public void createTable() {
        String url = "jdbc:mysql://localhost:3306/mysql";
        String username = "root";
        String password = "8539909495";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the table name: ");
        String tname = sc.nextLine();
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement smt = connection.createStatement();
            // Corrected the query string
            String query = "create table " + tname + " (eid int, address varchar(255), name varchar(255))";
            smt.execute(query);
            System.out.println("Table created");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void insertData() {
    	String url = "jdbc:mysql://localhost:3306/mysql";
        String username = "root";
        String password = "8539909495";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id:");
        int eid =   sc.nextInt();
        System.out.println("Enter the address:");
        String ad = sc.nextLine();
        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "insert into alpha values(?,?,?)";
            PreparedStatement smt = connection.prepareStatement(query);
            smt.setInt(1, eid);
            smt.setString(2, ad);
            smt.setString(3, name);
            // Corrected the query string
            
            smt.execute();
            System.out.println("data inserted");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    	
    }
    
    public void readData() {
    	String url = "jdbc:mysql://localhost:3306/mysql";
        String username = "root";
        String password = "8539909495";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table:");
        String ename = sc.nextLine();
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "select * from "+ename;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
            	System.out.println("id = "+rs.getInt(1));
            	System.out.println("address = "+rs.getString(2));
            	System.out.println("Name = "+rs.getString(3));
            }
            
       
            System.out.println("data readed");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    	
    }
    
    public void updateData() {
    	String url = "jdbc:mysql://localhost:3306/mysql";
        String username = "root";
        String password = "8539909495";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id to be updated: ");
        int ed = sc.nextInt();
        System.out.println("Enter the name to be uodated: ");
        String xname = sc.nextLine();
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "update alpha set eid = ? where name = ?";
            PreparedStatement smt = connection.prepareStatement(query);
            smt.setInt(1, ed);
            smt.setString(2, xname);
        
            // Corrected the query string
            
            smt.execute();
            System.out.println("data updated");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void deleteData() {
    	String url = "jdbc:mysql://localhost:3306/mysql";
        String username = "root";
        String password = "8539909495";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id:");
        int xid = sc.nextInt();
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "delete from alpha where eid = ?";
            PreparedStatement smt = connection.prepareStatement(query);
            smt.setInt(1, xid);
            
        
            // Corrected the query string
            
            smt.execute();
            System.out.println("data deleted");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    	
    }
}



