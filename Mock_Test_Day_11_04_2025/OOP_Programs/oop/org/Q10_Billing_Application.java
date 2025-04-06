package oop.org;

/*
 *  Q10. WAP to create billing application 
Classes 
Customer : id,name and mobile mark as POJO class
Product class: id,name,price,qty,rate 
Bill class contain method 
void calBill(Customer c,Product …p): this function can accept single customer 
detail and multiple product details and your output should like as
 */

import java.util.*;

class Customer
{
	private int id;
	private String name;
	private String mobile;	
	
	Customer()
	{
		
	}
	
	Customer(int id , String name, String mobile)
	{
		this.id = id;
		this.name = name;
		this.mobile = mobile;
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
	
	public String getMobile() 
	{
		return mobile;
	}
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}
}

class Product
{
	private int id;
	private String name;
//	private double price;
	private int qty;
	private double rate;
	
	Product()
	{
		
	}
	
	Product(int id, String name, int qty, double rate)
	{
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.rate = rate;
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
	
	public int getQty() 
	{
		return qty;
	}
	public void setQty(int qty) 
	{
		this.qty = qty;
	}
	
	public double getRate() 
	{
		return rate;
	}
	public void setRate(double rate) 
	{
		this.rate = rate;
	}
}

class Bill
{
	void calBill(Customer c,Product ...p)
	{
		System.out.println("Customer Id:\t" + c.getId());
		System.out.println("Cutomer Name:\t" + c.getName());
		System.out.println("Cutomer Mobile:\t" + c.getMobile());
		
		System.out.println("=========================================================================");
		
		System.out.println("ID\t" + "Name\t" + "Quntity\t" + "Rate\t" + "Total");
		System.out.println("-------------------------------------------------------------------------");
		
		int allTotal = 0;
		for (int i = 0; i < p.length; i++) 
		{
			System.out.println(p[i].getId() + "\t" + p[i].getName() + "\t" + p[i].getQty() + "\t" + p[i].getRate() + "\t" + (p[i].getQty() * p[i].getRate()));
			allTotal = allTotal + (int) (p[i].getQty() * p[i].getRate());
		}
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("\t\t\t\tTotal Bill:" + allTotal);
		System.out.println("=========================================================================");
	}
}


public class Q10_Billing_Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the customer Id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		
		System.out.println("Enter the Mobile Number");
		String mobile = sc.nextLine();
		
		System.out.println("How Many Product Purches");
		int nProduct = sc.nextInt();
		
		Customer customer = new Customer(id, name, mobile);
		
		Product[] product = new Product[nProduct];
		
		for (int i = 0; i < product.length; i++) 
		{
			System.out.println("Enter the id");
			id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Name");
			name = sc.nextLine();
			
			System.out.println("Enter the Quntity");
			int qty = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Rate");
			double rate = sc.nextDouble();
			sc.nextLine();
			
			Product prodcut;
			product[i] =  new Product(id,name,qty,rate);;
		}
		
		Bill bill =  new Bill();
		
		bill.calBill(customer, product);
		
	}

}
