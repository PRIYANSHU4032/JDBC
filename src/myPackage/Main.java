package myPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        // Load the MySQL JDBC driver class
        

        Dbconnection db = new Dbconnection();
        db.connectDatabase();
        Operations op = new Operations();
        //op.createTable();
        //op.insertData();
        //op.readData();
        //op.updateData();
        //op.deleteData();
        System.out.println(".....................Welcome to employee management tool.....................");
        System.out.println("Press the following key to perform differtent operations:- ");
        System.out.println("1.Create Table              2.Insert Data");
        System.out.println("3.Read Table                4.Update Data");
        System.out.println("5.Delete data");
        System.out.println("Enter your Choice: ");
        int ch = sc.nextInt();
        
        switch(ch) {
        case 1:
        	op.createTable();
        	break;
        case 2:
        	op.insertData();
        	break;
        case 3:
        	op.readData();
        	break;
        case 4:
        	op.updateData();
        case 5:
        	op.deleteData();
		default:
			System.out.println("please enter vaild input");
        }
    }
}
