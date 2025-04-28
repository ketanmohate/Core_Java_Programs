package org.Assignments;

import java.util.*;
import java.sql.*;

public class Date_28_04_2025_Q1 
{
	public static void main(String[] args) throws SQLException
	{		
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
			
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations", "root", "ketan@9595");
		
		if(conn!=null) {
			System.out.println("Connection Successfully.....");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Product Name");
			String pName = sc.nextLine();
			
			System.out.println("Enter the Product Company Name");
			String pCompany = sc.nextLine();
			
			System.out.println("Enter the Product Price");
			int pPrice = sc.nextInt();
			sc.nextLine();
			
			CallableStatement cstmt = conn.prepareCall("{call saveProduct(?,?,?)}");
			
			cstmt.setString(1, pName);
			cstmt.setString(2, pCompany);
			cstmt.setInt(3, pPrice);
			
			boolean b = cstmt.execute();
			
			if(!b) {
				System.out.println("Call Seccessfully.........");
			}else {
				System.out.println("Some Proble Is there...........!");
			}
			
			
		}else {
			System.out.println("Connection Faild.....!");
		}
	}
}
