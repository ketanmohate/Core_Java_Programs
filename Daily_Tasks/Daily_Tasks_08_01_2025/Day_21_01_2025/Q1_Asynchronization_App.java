package Day_21_01_2025;

import java.util.*;

class Product
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

class MachineOne extends Thread
{
	Product[] product;
	
	public void setProduct(Product ...p)
	{
		this.product=p;
	}
	
	int m=1;
	public void run()
	{
		try
		{
			for(int i=0 ; i<10 ; i++)
			{
				System.out.println("Machin One Prodcut " + m++);
				sleep(1000);
			}
		}
		catch (InterruptedException e) 
		{
			System.out.println("Error Is:" + e.getMessage());
		}
	}
}

class MachineTow extends Thread
{
	Product[] product;
	
	public void setProduct(Product ...p)
	{
		this.product=p;
	}
	
	int k=1;
	public void run()
	{
		try
		{
			for(int i=0 ; i<10 ; i++)
			{
				System.out.println("Machin Tow Prodcut " + k++);
				sleep(1000);
			}
		}
		catch (InterruptedException e) 
		{
			System.out.println("Error Is:" + e.getMessage());
		}
	}
}

public class Q1_Asynchronization_App 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		
		Product[] arrP = new Product[20];
 		
		for(int i=0 ; i<arrP.length ; i++)
		{
			System.out.println("Enter the Id:");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Name:");
			String name = sc.nextLine();
			
			System.out.println("------------------------------------------------------------------");
			
			Product p = new Product();
			
			p.setId(id);
			p.setName(name);
			
			arrP[i] = p;
		}
		
		MachineOne m1 = new MachineOne();
		m1.setProduct(arrP);
		m1.start();

		MachineTow m2 = new MachineTow();
		m2.setProduct(arrP);
		m2.start();
	}
}

