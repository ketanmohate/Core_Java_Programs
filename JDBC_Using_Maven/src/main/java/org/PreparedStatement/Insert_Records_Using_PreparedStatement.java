package org.PreparedStatement;

import java.sql.*;
import java.util.*;

public class Insert_Records_Using_PreparedStatement 
{
	public static void main(String[] args) throws SQLException
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations", "root", "ketan@9595");
		
		if(conn!=null) {
			System.out.println("Database Connected Successfully.....");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Name");
			String name = sc.nextLine();
			
			System.out.println("Enter the Price");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Author");
			String author = sc.nextLine();
			
			System.out.println("Enter the Publication");
			String publication = sc.nextLine();
	
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO books(Name, Price, Author, Publication) VALUES (?, ?, ?, ?)");
			
			stmt.setString(1, name);
			stmt.setInt(2, price);
			stmt.setString(3,author);
			stmt.setString(4, publication);
			
			int val = stmt.executeUpdate();
			
			if(val>0) {
				System.out.println("Record insert successfully....");
			}
			else {
				System.out.println("Some proble is there......!");
			}
//			 conn.close();
//		     sc.close();
		}
		else {
			System.out.println("Database Not Connected........!");
		}
		
	}
}
