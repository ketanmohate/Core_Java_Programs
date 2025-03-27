package Test;

import java.util.*;

class Book
{
	private int bookId;
	private String title;
	private String author;
	private float price;
	private int availableCopies;

	public void setBookId(int bookId)
	{
		this.bookId = bookId;
	}
	public int getBookId()
	{
		return bookId;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return author;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	public float getPrice()
	{
		return price;
	}
	
	public void setAvailableCopies(int availableCopies)
	{
		this.availableCopies = availableCopies;
	}
	public int getAvailableCopies()
	{
		return availableCopies;
	}
	
}

class LibraryManager
{
	Scanner sc = new Scanner(System.in);
	
	Book[] b;
	LibraryManager(Book ...b)
	{
		this.b=b;
	}
	
	void addBook()
	{
		System.out.println("------------------------------");
		System.out.println("How mnay Book insert");
		int nBooks = sc.nextInt();
		System.out.println("------------------------------");
		
		b = new Book[nBooks];
		
		for(int i=0 ; i<b.length ; i++)
		{
			System.out.println("Enter the book Id");
			int bookId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the title");
			String title = sc.nextLine();
			
			System.out.println("Enter the author");
			String author = sc.nextLine();
			
			System.out.println("Enter the price");
			float price = sc.nextFloat();
			sc.nextLine();
			
			System.out.println("Enter the availableCopies");
			int availableCopies = sc.nextInt();
			sc.nextLine();
			
			Book book = new Book();
			
			book.setBookId(bookId);
			book.setTitle(title);
			book.setAuthor(author);
			book.setPrice(price);
			book.setAvailableCopies(availableCopies);
			
			b[i] = book;
		}
	}
	
	void removeBook(int bookId)
	{
		if(b != null)
		{
			for(int i=0 ; i<b.length ;i++)
			{
				if(b[i] != null)
				{
					if(b[i].getBookId() == bookId)
					{
						System.out.println("remove Book succsefully");
						System.out.println("Book Id\t" + b[i].getBookId());
						System.out.println("Book title\t" + b[i].getTitle());
						System.out.println("Book author\t" + b[i].getAuthor());
						System.out.println("Book price\t" + b[i].getPrice());
						System.out.println("Book available Copies\t" + b[i].getAvailableCopies());
						System.out.println("----------------------------------");	
						b[i] = null;
					}
					else
					{
						System.out.println("id not found");
					}	
				}
				else
				{
					System.out.println("No Any Books");
				}	
			}
		}
		else
		{
			System.out.println("No Any Books!");
		}
	}
	
	void searchBook(String title)
	{
		if(b != null)
		{
			for(int i=0 ; i<b.length ;i++)
			{
				if(b[i] != null)
				{
					if(b[i].getTitle().equals(title))
					{
						System.out.println("Book Id\t" + b[i].getBookId());
						System.out.println("Book title\t" + b[i].getTitle());
						System.out.println("Book author\t" + b[i].getAuthor());
						System.out.println("Book price\t" + b[i].getPrice());
						System.out.println("Book available Copies\t" + b[i].getAvailableCopies());
						System.out.println("----------------------------------");	
					}
					else
					{
						System.out.println("title not found");
					}	
				}
				else
				{
					System.out.println("title not found");
				}		
			}
		}
		else
		{
			System.out.println("No Any Books!");
		}
	}
	
	void displayAllBook()
	{
		if(b != null)
		{
			System.out.println("Show All Books");
			for(int i=0 ; i<b.length ;i++)
			{
				if(b[i] != null)
				{
					
					System.out.println("Book Id\t" + b[i].getBookId());
					System.out.println("Book title\t" + b[i].getTitle());
					System.out.println("Book author\t" + b[i].getAuthor());
					System.out.println("Book price\t" + b[i].getPrice());
					System.out.println("Book available Copies\t" + b[i].getAvailableCopies());
					System.out.println("----------------------------------");	
				}
				else
				{
					System.out.println("No Any Books");
				}	
			}
		}
		else
		{
			System.out.println("No Any Books!");
		}
		
	}
}	

public class LibraryManagementSystem
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		Book[] b = null;
		
		LibraryManager l = new LibraryManager(b);
		
		do{
			
			System.out.println("==================================");
			System.out.println("Case1: Add Book");
			System.out.println("Case2: Remove Book");
			System.out.println("Case3: Search Book");
			System.out.println("Case4: Display All Book");
			System.out.println("Case5: Exit");
			System.out.println("==================================");
			
			System.out.println("----------------------------------");
			System.out.println("Enter your Choise");
			int choise = sc.nextInt();
			sc.nextLine();
			System.out.println("----------------------------------");
			
			switch(choise)
			{
				case 1:
					l.addBook();
					break;
				
				case 2:
					System.out.println("Enter the book Id");
					int bookId= sc.nextInt();
					sc.nextLine();
					l.removeBook(bookId);
					break;
				
				case 3:
					System.out.println("Enter the title");
					String title = sc.nextLine();
					l.searchBook(title);
					break;
				
				case 4:
					l.displayAllBook();
					break;
				
				case 5:
					flag = false;
					break;
					
				default:
					System.out.println("enter valid inpute");
			}
			
		}while(flag == true);
	}
}