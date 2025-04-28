package org.Assignments;

import java.util.*;
import java.sql.*;

public class Date_28_04_2025_Q2 
{
	public static void main(String[] args) 
	{
		try {
			
			com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
			
			DriverManager.registerDriver(d);
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations", "root", "ketan@9595");
			
			
			if(conn!=null) {
				System.out.println("Database Connection Successfully...........");
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the Product Id");
				int id = sc.nextInt();
//				sc.nextLine();
				
				CallableStatement cstmt = conn.prepareCall("{call getProduct(?, ?)}");
				
				cstmt.setInt(1, id);
				cstmt.registerOutParameter(2, Types.VARCHAR);
			
				boolean b = cstmt.execute();
				
				if(!b) {
					System.out.println("Product Name");
					String name = cstmt.getString(2);
					System.out.println(name);
				}else {
					System.out.println("Some Problem there............!");
				}	
				 
				cstmt.close();
				conn.close();
				
			}else {
				System.out.println("Database Connection Falid.........!");
			}
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}
