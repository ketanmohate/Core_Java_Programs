package Day_21_01_2025;

import java.util.*;

class Products
{
	private int id;
	private String name;
	
	public void setId(int id)
	{   
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}

class Machine_One extends Thread
{
	Products[] product;
	
	public void setProduct(Products ...p)
	{
		this.product=p;
	}
	
	synchronized public void run()
	{
		try
		{
			for(int i=0 ; i<10 ; i++)
			{
				System.out.println("Machin One Prodcut " + product[i].getId());
				sleep(1000);
			}
		}
		catch (InterruptedException e) 
		{
			System.out.println("Error Is:" + e.getMessage());
		}
	}
}

class Machine_Tow extends Thread
{
	Products[] product;
	
	public void setProduct(Products ...p)
	{
		this.product=p;
	}
	
	synchronized public void run()
	{
		try
		{
			for(int i=10 ; i<product.length ; i++)
			{
				System.out.println("Machin Tow Prodcut " + product[i].getId());
				sleep(1000);
			}
		}
		catch (InterruptedException e) 
		{
			System.out.println("Error Is:" + e.getMessage());
		}
	}
}
public class Q2_Synchronization_App 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		
		Products[] arrP = new Products[20];
 		
		for(int i=0 ; i<arrP.length ; i++)
		{
			System.out.println("Enter the Id:");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Name:");
			String name = sc.nextLine();
			
			System.out.println("------------------------------------------------------------------");
			
			Products p = new Products();
			
			p.setId(id);
			p.setName(name);
			
			arrP[i] = p;
		}
		
		Machine_One m1 = new Machine_One();
		m1.setProduct(arrP);
		m1.start();
		m1.join();
		
		Machine_Tow m2 = new Machine_Tow();
		m2.setProduct(arrP);
		m2.start();
		m2.join();
	}
}
