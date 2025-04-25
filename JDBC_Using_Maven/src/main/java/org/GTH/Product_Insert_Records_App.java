package org.GTH;

import java.sql.*;
import java.util.*;

public class Product_Insert_Records_App {

	public static void main(String[] args) throws SQLException{
		
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations","root","ketan@9595");
		
		if(conn!=null) {
			System.out.println("Databace Connected Successfully....");
			
			Statement stnt = conn.createStatement();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Name");
			String name = sc.nextLine();
			
			System.out.println("Enter the Price");
			int price = sc.nextInt();
			
			int val = stnt.executeUpdate("insert into products values('0', '"+name+"', '"+price+"')");
			
			if(val>0) {
				System.out.println("Record Insert Seccessfully....");
			}else {
				System.out.println("some Problem there....!");
			}
			
		}else {
			System.out.println("Databace Not Connected....");
		}
	}

}
