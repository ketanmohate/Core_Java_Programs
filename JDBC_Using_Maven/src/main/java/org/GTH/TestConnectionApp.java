package org.GTH;

import java.sql.*;

public class TestConnectionApp 
{
	public static void main(String[] args) throws SQLException 
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		System.out.println("Driver Register Successfully.........");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcopations","root","ketan@9595");
		
		if(conn!=null)
		{	
			System.out.println("DataBase Connected Successfully....");
			
			Statement stat = conn.createStatement();
			
			int create = stat.executeUpdate("create table employees(Id int, Name varchar(200), Salary int)");
			
			System.out.println("val:"+create);
			if(create==0)
			{
				System.out.println("Table create successfully......");
				int insert = stat.executeUpdate("insert into employees values(1, 'Ketan Mohate', 50000)");
				
				System.out.println("insert:"+insert);
				if(insert>0)
				{
					System.out.println("Records Save successfully.....");
				}
				else {
					System.out.println("Some Problem there.....");
				}
			}
			else {
				System.out.println("Table not create....");
			}
		}
		else {
			System.out.println("Database is not Connected.....");
		}
	}

}
