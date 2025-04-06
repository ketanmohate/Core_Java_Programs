package oop.org;

import java.util.Scanner;

/*
 * Q7. WAP to create POJO class name as Book  with field id,
 * name and price and author and input the book details and display it.
 */

class Book
{
	private int id;
	private String name;
	private int price;
	private String author;
	
	Book()
	{
		
	}
	
	Book(int id, String name, int price, String author)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public String getAuthor() 
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void Display()
	{
		System.out.println("Id\t" + this.getId());
		System.out.println("Name\t" + this.getName());
		System.out.println("Price\t" + this.getPrice());
		System.out.println("Author\t" + this.getAuthor());
	}
}

public class Q7_POJO_Example_Book {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ID");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		
		System.out.println("Enter the price");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Author");
		String author = sc.nextLine();
		
		Book bk = new Book(id,name,price,author);
		bk.Display();

	}

}
