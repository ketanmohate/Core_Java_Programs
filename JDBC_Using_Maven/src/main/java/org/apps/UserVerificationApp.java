package org.apps;

import java.util.*;
import java.sql.*;

public class UserVerificationApp 
{
	public static void main(String[] args) throws SQLException
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations", "root" , "ketan@9595");
		
		if(conn!=null){
			System.out.println("Database Connection Successfully.....");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Username");
			String vUsername = sc.nextLine();
			
			System.out.println("Enter the Password");
			String vPass = sc.nextLine();
			
			PreparedStatement pstmt = conn.prepareStatement("Select *from registers where Username = ? and Password = ?");
			
			pstmt.setString(1, vUsername);
			pstmt.setString(2, vPass);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				
				System.out.println("******************************************************");
				System.out.println("Login Successfully........");
				System.out.println("******************************************************");
				
				System.out.println("======================================================");
				System.out.println("User Information");
				System.out.println("======================================================");
				
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("Id\t" + "Name         \t\t" + "Email                          \t\t" + "Contact\t      " + "Username");
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String contact = rs.getString(4);
				String username = rs.getString(5);
//				String password = rs.getString(6);
				
				System.out.println(id + "\t" + name + "\t\t" + email + "\t\t" + contact + "\t" + username);
				
				System.out.println("---------------------------------------------------------------------------------------------------");
			}
			else {
				System.out.println("Login Faild.......!");
			}
			
			
		}
		else {
			System.out.println("Database Connection faild......!");
		}
	}
}
