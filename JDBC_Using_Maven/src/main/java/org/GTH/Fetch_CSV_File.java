package org.GTH;

import java.util.*;
import java.sql.*;
import java.io.*;

public class Fetch_CSV_File 
{
	public static void main(String []args) throws ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations", "root", "ketan@9595");
			
			if(conn!=null) {
				System.out.println("Connection Successfully......");
				
				try {
					FileReader fr = new FileReader("C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\JDBC_Using_Maven\\src\\main\\java\\org\\GTH\\CSV_File.csv");
					
					BufferedReader bf = new BufferedReader(fr);
					
					try {
						String data;
						
						int val = 0;
						
						while((data = bf.readLine())!=null) {
							String [] line = data.split(",");
							
							PreparedStatement pstmt = conn.prepareStatement("insert into employees(Id, Name, Salary) values(?,?,?)");
							
							pstmt.setInt(1, Integer.parseInt(line[0]));
							pstmt.setString(2, line[1]);
							pstmt.setString(3, line[2]);
							
							val = pstmt.executeUpdate();
							
						}
						if(val>0) {
							System.out.println("Records Succesfully Insert..........");
						}else {
							System.out.println("Some Problem is There...........!");
						}
					}
					catch(IOException e) {
						System.out.println(e);
					}
				
				}
				catch(FileNotFoundException e) {
					System.out.println("File Not Found...............!");
				}
				
			}else {
				System.out.println("Connection Falid......!");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
