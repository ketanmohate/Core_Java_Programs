package org.GTH;

import java.util.*;
import java.sql.*;

public class Inssert_Records_Using_User_inpute 
{
	public static void main(String[] args) throws SQLException
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations","root","ketan@9595");
		
		if(conn!=null) {
			System.out.println("Database Connected Successfully...");
			
			Statement stmt = conn.createStatement();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Name");
			String name = sc.nextLine();
			
			System.out.println("Enter the Email");
			String email = sc.nextLine();
			
			System.out.println("Enter the Phone Number");
			String pNumber = sc.nextLine();
			
			int val = stmt.executeUpdate("insert into players values('"+name+"', '"+email+"' , '"+pNumber+"')");// this id SQL injection
			
			if(val>0) {
				System.out.println("Records insert Successfully...");
			}else {
				System.out.println("Some Problem there...");
			}
			
		}else {
			System.out.println("Database not connected....");
		}
	}
}
