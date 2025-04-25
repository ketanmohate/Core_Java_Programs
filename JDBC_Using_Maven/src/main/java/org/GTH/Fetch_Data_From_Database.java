package org.GTH;

import java.sql.*;

public class Fetch_Data_From_Database 
{
	public static void main(String[] args) throws SQLException 
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations", "root", "ketan@9595");
		
		if(conn!=null) {
			System.out.println("Database Connected Successfully...");
			System.out.println("=====================================================");
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("Select *from products");
			
			System.out.println("Id\t\t" + "Name\t\t" + "Price");
			System.out.println("-----------------------------------------------------");
			
			while(rs.next()) {
				int pId = rs.getInt(1);
				String pName = rs.getString(2);
				int pPrice = rs.getInt(3);
				System.out.println(pId + "\t\t" + pName +"\t\t" + pPrice);
			}
			System.out.println("-----------------------------------------------------");
		}else {
			System.out.println("DataBase Not Connected...!");
		}
	}
}
