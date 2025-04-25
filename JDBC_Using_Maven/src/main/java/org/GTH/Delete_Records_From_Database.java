package org.GTH;

import java.util.*;
import java.sql.*;

public class Delete_Records_From_Database 
{
	public static void main(String[] args) throws SQLException
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations","root","ketan@9595");
		
		if(conn!=null) {
			System.out.println("Database Connected Successfully...");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Product ID to delete a product.");
			int pId = sc.nextInt();
			
			Statement stmt = conn.createStatement();
			
			int val = stmt.executeUpdate("delete from products where Id="+pId);
			
			if(val>0)
			{
				System.out.println("Delete Record successfully...");
			}
			else 
			{
				System.out.println("Some problem....!");
			}
		}
		else 
		{
			System.out.println("Database is Not Connected...!");
		}		
	}
}