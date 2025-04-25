package org.apps;

import java.util.*;
import java.sql.*;

class Oprations
{
	Scanner sc = new Scanner(System.in);
	
	public void insertRecords(Statement stmt) throws SQLException
	{
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		
		System.out.println("Enter the Price");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Author");
		String author = sc.nextLine();
		
		System.out.println("Enter the Publication");
		String publication = sc.nextLine();
		
//		int val = stmt.executeUpdate("insert into books values('0', '"+name+"', '"+price+";', '"+author+";', '"+publication+"')");
		
		int val = stmt.executeUpdate("INSERT INTO books(name, price, author, publication) VALUES('" + name + "', " + price + ", '" + author + "', '" + publication + "')");

		System.out.println(val);
		
		if(val>0) {
			System.out.println("Records Insert Successfully...");
		}else {
			System.err.println("Some Problem There....!");
		}
	}
	
	public void deleteBookUsingId(Statement stmt) throws SQLException
	{
		System.out.println("Enter the Id");
		int id = sc.nextInt();
		
		int val = stmt.executeUpdate("delete from books where id = " + id);
		
		if(val>0) {
			System.out.println("Delete Records Successfully....");
		}else {
			System.out.println("Some Problem There.....!");
		}
	}
	
	public void updateRecords(Statement stmt) throws SQLException
	{
		System.out.println("Enter the Id to update records");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the new Name");
		String nName = sc.nextLine().replace("'", "''");
		
		System.out.println("Enter the new Price");
		int nPrice = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the new Publication");
		String newPublication = sc.nextLine().replace("'", "''");
		
		int val = stmt.executeUpdate("UPDATE books SET Name = '" + nName + 
                "', Price = " + nPrice + 
                ", Publication = '" + newPublication + 
                "' WHERE Id = " + id);
		
		if(val>0) {
			System.out.println("Update Successfully....");
		}else {
			System.out.println("Some Problem there");
		}
	}
	
	public void fetchAllBookDetails(Statement stmt) throws SQLException
	{
		ResultSet rs = stmt.executeQuery("select *from books");
		
		System.out.println("=====================================================================");
		System.out.println("id\t" + "Name\t" + "Price\t" + "Author\t" + "Publication");
		System.out.println("---------------------------------------------------------------------");
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int price = rs.getInt(3);
			String author = rs.getString(4);
			String publication = rs.getString(5);
			
			System.out.println(id + "\t" + name + "\t" + price + "\t" + author + "\t" + publication);
		}
		System.out.println("=====================================================================");
	}
	
	public void fetchBookUsingId(Statement stmt) throws SQLException
	{
		System.out.println("Enter the id");
		int bId = sc.nextInt();
		
		ResultSet rs = stmt.executeQuery("select *from books where id = " + bId);
		
		System.out.println("=====================================================================");
		System.out.println("id\t" + "Name\t" + "Price\t" + "Author\t" + "Publication");
		System.out.println("---------------------------------------------------------------------");
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int price = rs.getInt(3);
			String author = rs.getString(4);
			String publication = rs.getString(5);
			
			System.out.println(id + "\t" + name + "\t" + price + "\t" + author + "\t" + publication);
		}
		System.out.println("=====================================================================");
	}
	
	public void displayBookCountAuthorWise(Statement stmt) throws SQLException
	{		
		ResultSet rs = stmt.executeQuery("SELECT Author, COUNT(*) AS Book_Count FROM books GROUP BY Author;");
		
		System.out.println("Author\t\t" + "Book Count");
	    System.out.println("-----------------------------");
		
		while(rs.next()) {
			 String author = rs.getString("Author");
		     int count = rs.getInt("Book_Count");

		     System.out.println(author + "\t\t" + count);
		}
	}
	
	public void displayBookNamesByAuthor(Statement stmt) throws SQLException 
	{
	    ResultSet rs = stmt.executeQuery("SELECT Author, Name FROM books ORDER BY Author");

	    String currentAuthor = "";
	    boolean first = true;

	    while (rs.next()) {
	        String author = rs.getString("Author");
	        String name = rs.getString("Name");

	        // If the author changes, print the author's name
	        if (!author.equals(currentAuthor)) {
	            if (!first) {
	                System.out.println(); // newline between different authors
	            }
	            System.out.println("Author: " + author);
	            System.out.println("Books:");
	            currentAuthor = author;
	            first = false;
	        }

	        // Print the book name
	        System.out.println(" - " + name);
	    }
	}

}

public class Library_App 
{
	public static void main(String[] args) throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations", "root", "ketan@9595");
		
		if(conn!=null) {
			System.out.println("Database Connected Successfully....");
			
			Statement stmt = conn.createStatement();
			
			Oprations op = new Oprations();
			
			do {

				System.out.println("====================================================================================");
				System.out.println("\t Menu List");
				System.out.println("====================================================================================");
				System.out.println("Case 1: Insert record in book table \r\n"
						+ "Case 2: delete book by using id and author name\r\n"
						+ "Case 3: update book price,name,Publication using its id\r\n"
						+ "Case 4: fetch all book details\r\n"
						+ "Case 5: fetch book by using its id\r\n"
						+ "Case 6: display book count author wise\r\n"
						+ "Case 7: display the book name by author wise\r\n"
						+ "Case 8: Exit");
				System.out.println("====================================================================================");
				
				System.out.println("Enter your choice");
				int choice = sc.nextInt();
				
				switch(choice) {
					case 1:
						op.insertRecords(stmt);
						break;
						
					case 2:
						op.deleteBookUsingId(stmt);
						break;
						
					case 3:
						op.updateRecords(stmt);
						break;
						
					case 4:
						op.fetchAllBookDetails(stmt);
						break;
						
					case 5:
						op.fetchBookUsingId(stmt);
						break;
						
					case 6:
						op.displayBookCountAuthorWise(stmt);
						break;
						
					case 7:
						op.displayBookNamesByAuthor(stmt);
						break;
												
					case 8:
						System.exit(0);
						
					default :
						System.out.println("Invalid Choice......!");
				}
				
			}while(true);
			
		}else {
			System.out.println("Database Not Connacted...!");
		}
	}
}
