package org.PreparedStatement;

import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.sql.*;

public class Delete_Records_Using_PreparedStatement 
{
	public static void main(String[] args) throws SQLException 
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations","root","ketan@9595");
		
		if(conn!=null) {
			System.out.println("Database Connected Seccesfully..........");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the ID");
			int bId = sc.nextInt();
//			sc.nextLine();
			
			PreparedStatement pstmt = conn.prepareStatement("delete from books where id = ?");
			
			pstmt.setInt(1, bId);
			
			int val = pstmt.executeUpdate();
			
			if(val>0) {
				System.out.println("Record delete successfully.....");
			}
			else {
				System.out.println("Some proble is there............!");
			}
		}
		else {
			System.out.println("Data base not Connected.....!");
		}

	}
}
