package org.GTH;
import java.sql.*;

public class TestConnectionApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcopations"; 
        String username = "root";
        String password = "ketan@9595"; 

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Close the connection
            con.close();
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } 
        catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}
