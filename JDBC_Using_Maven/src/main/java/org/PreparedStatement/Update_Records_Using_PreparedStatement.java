package org.PreparedStatement;

import java.util.*;
import java.sql.*;

public class Update_Records_Using_PreparedStatement 
{
	public static void main(String[] args) throws SQLException
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations", "root" ,"ketan@9595");
		
		if(conn!=null) {
			System.out.println("Database Conected successfully..........");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the id to update its records");
			int bId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Name");
			String name = sc.nextLine();
			
			System.out.println("Enter the Price");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Author");
			String author = sc.nextLine();
			
			System.out.println("Enter the Publication");
			String publication = sc.nextLine();
			
			PreparedStatement pstmt = conn.prepareStatement("update books set Name = ? , Price = ? , Author = ? , Publication = ? where id = ?");
			
			pstmt.setString(1, name);
			pstmt.setInt(2, price);
			pstmt.setString(3, author);
			pstmt.setString(4, publication);
			pstmt.setInt(5, bId);
			
			int val = pstmt.executeUpdate();
			
			if(val>0) {
				System.out.println("Records Update Successfully......");
			}
			else {
				System.out.println("some Problems is there.......!");
			}
		}
		else {
			System.out.println("Database not Connacted.......!");
		}
	}
}
