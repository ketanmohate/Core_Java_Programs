package org.GTH;

import java.util.*;
import java.sql.*;

public class Update_The_Records 
{
	public static void main(String[] args) throws SQLException
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations", "root", "ketan@9595");
		
		if(conn!=null) {
			System.out.println("Database Connected Successfully...");
			
			Statement stmt = conn.createStatement();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the id");
			int pId = sc.nextInt();
			
			System.out.println("Enter the Price");
			int pPrice = sc.nextInt();
			
			int val = stmt.executeUpdate("update products set Price = "+pPrice+" where Id = "+ pId);
			
			if(val>0) {
				System.out.println("Update Successfully.....");
			}else {
				System.out.println("Some Proble there....!");
			}
		}else {
			System.out.println("Database Not Connected...!");
		}
	}
}
