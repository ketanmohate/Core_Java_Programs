package org.PreparedStatement;

import java.util.*;
import java.sql.*;

public class Select_Records_Using_PreparedStatement 
{
	public static void main(String[] args) throws SQLException
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations", "root", "ketan@9595");
		
		if(conn!=null) {
			System.out.println("Database connection Successfully......");
			
			PreparedStatement pstmt = conn.prepareStatement("select *from books");
			
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println("=================================================================");
			System.out.println("Id\t" + "Name\t" + "Price\t" + "Author\t" + "publication");
			System.out.println("=================================================================");
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String author = rs.getString(4);
				String publication = rs.getString(5);
				
				System.out.println(id + "\t" + name + "\t" + price + "\t" + author + "\t" + publication);
			}
			System.out.println("-----------------------------------------------------------------");
		}
		else {
			System.out.println("Databse Connection Faild....!");
		}
	}
}