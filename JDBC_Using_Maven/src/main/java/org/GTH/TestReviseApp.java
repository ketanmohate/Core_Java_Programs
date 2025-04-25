package org.GTH;

import java.sql.*;

public class TestReviseApp 
{
	public static void main(String[] args) throws SQLException
	{
		 com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		 
		 DriverManager.registerDriver(d);
		 
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations","root","ketan@9595");
		 
		 if(conn!=null) {
			 System.out.println("Database is connected succsessfully...");
			 
			 Statement stmt = conn.createStatement();
			 
			 int val = stmt.executeUpdate("insert into players values('Ketan Mohate','ketan@gmail.com', '9595533023')");
			 
			 if(val>0) {
				 System.out.println("Record insert successfully......");
			 }else {
				 System.out.println("Some Proble there......");
			 }
		 }
		 else {
			 System.out.println("Database is not connected....");
		 }
	}
}
