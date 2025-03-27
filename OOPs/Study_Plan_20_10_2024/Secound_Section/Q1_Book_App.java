package Secound_Section;

/* 1) Write a Java program to create a class called "Book" with attributes 
for title, author, and ISBN, and methods to add,view,show,update and remove 
book record from array of object ,ask size of array of object from user.
*/

import java.util.*;

class Book
{
    private String title;
    private String author;
    private String ISBN;
	
	void setTitle(String title)
	{
		this.title=title;
	}
	String getTitle()
	{
		return title;
	}
	
	void setAuthor(String author)
	{
		this.author=author;
	}
	String getAuthor()
	{
		return author;
	}
	
	void setISBN(String ISBN)
	{
		this.ISBN=ISBN;
	}
	String getISBN()
	{
		return ISBN;
	}
		
}

public class Q1_Book_App 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void addBook(Book[] book )
	{
		System.out.println("Enter the Book Details");
		System.out.println("----------------------");
		
		for(int i=0 ; i<book.length;i++)
		{
			System.out.println("Enter the Title");
			String title=sc.nextLine();
			
			System.out.println("Enter the Author Name");
			String author=sc.nextLine();
			
			System.out.println("Enter the ISBN");
			String ISBN=sc.nextLine();
			System.out.println("------------------------------------------------------");
			
			Book objbook = new Book();
			
			objbook.setTitle(title);
			objbook.setAuthor(author);
			objbook.setISBN(ISBN);
			
			book[i]=objbook;
		}
	}
	
	public static void viewBook(Book[] book)
	{
		if(book != null)
		{
			boolean found = false;
			System.out.println("======================================================");
			System.out.println("Title\t\t" + "Author\t\t" + "ISBC\t\t");
			System.out.println("======================================================");
			for(int i=0 ; i<book.length;i++)
			{
				if(book[i] != null)
				{
					System.out.println(book[i].getTitle() + "\t\t" + book[i].getAuthor() + "\t\t" + book[i].getISBN() + "\t\t");
					found = true;
				}
			}
			System.out.println("------------------------------------------------------");
			if(found == false)
			{
				System.out.println("Record not found");
			}
		}
		else
		{
			System.out.println("Record not found");
		}
	}
	
	public static void updateBook(Book[] book)
	{
		System.out.println("------------------------------------------------------");
		System.out.println("Enter the Title of Book");
		String title = sc.nextLine();
		System.out.println("------------------------------------------------------");
		
		if(book != null)
		{
			boolean found = false;
			for(int i=0 ; i<book.length ; i++)
			{
				if(book[i] != null)
				{
					if(book[i].getTitle().equals(title))
					{
						found = true;
						System.out.println("how to update:");
						System.out.println("======================");
						System.out.println("1: Title");
						System.out.println("2: Author");
						System.out.println("3: ISBC");
						System.out.println("======================");
						int choise = sc.nextInt();
						System.out.println("---------------------");
						sc.nextLine();
						
						switch(choise)
						{
							case 1:
								System.out.println("Enter the New Title");
								String nTitle = sc.nextLine(); 
								System.out.println("--------------------");
								book[i].setTitle(nTitle);
								break;
								
							case 2:
								System.out.println("Enter the New Author");
								String nAuthor = sc.nextLine();
								System.out.println("---------------------");
								book[i].setAuthor(nAuthor);
								break;
								
							case 3:
								System.out.println("Enter the New ISBC");
								String nISBC = sc.nextLine();
								System.out.println("------------------");
								book[i].setISBN(nISBC);
								break;
								
							default:
									System.out.println("Invalid");
						}
					}
				}
			}
			if(found == false)
			{
				System.out.println("Record not found");
			}
		}
		else
		{
			System.out.println("Record not found");
		}	
	}
	
	public static void removeBook(Book[] book)
	{
		System.out.println("--------------------------------------------");
		System.out.println("Enter the Title of book");
		String title = sc.nextLine();
		System.out.println("--------------------------------------------");
		
		if(book != null)
		{
			boolean found = false;

			for(int i=0; i<book.length; i++)
			{
				if(book[i] != null)
				{
					if(book[i].getTitle().equals(title))
					{
						System.out.println(book[i].getTitle()+" Book is deleted");
						book[i]=null;
						found = true;
						System.out.println("----------------------------------");
					}
				}
			}
			if(found == false)
			{
				System.out.println("Record not found");
			}
		}
		else
		{
			System.out.println("Record not found");
		}
	}
	public static void main(String[] args)
	{
		boolean exit = false;
		
		Book[] book = null;
		
		do
		{
			System.out.println("Enter the following");
			System.out.println("=================================");
			System.out.println("1: Add Book");
			System.out.println("2: View Book");
			System.out.println("3: Update Book");
			System.out.println("4: Remove Book");
			System.out.println("5: Exit");
			System.out.println("=================================");
			
			System.out.println("Enter your choise");
			int choise=sc.nextInt();
			sc.nextLine();
			System.out.println("------------------------------------------------------");
			
			switch (choise)
			{
				case 1:
					System.out.println("Enter how many Book Add");
					int size=sc.nextInt();
					sc.nextLine();
					
					book = new Book[size];
					
					addBook(book);
					break;
					
				case 2:
					viewBook(book);
					break;
					
				case 3:
					updateBook(book);
					break;
					
				case 4:
					removeBook(book);
					break;
					
				case 5:
					exit = true;
					break;
					
				default:
					System.out.println("Invalid");
			}
		}while(exit == false);
		
	}

}

