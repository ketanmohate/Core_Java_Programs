package Day_15_01_2025;

import java.beans.Customizer;

/*
Q2. WAP to create class name as Product as POJO class with field id,name and qty and price and you have to create 
Shop as class with following methods 

void setProducts(Customer customer,Product …p): this method can accept the n number of products 
void findBill(): this function can find the bill of a customer using the following format.
 */

import java.util.*;

class Product
{
	private int id;
	private String name;
	private int qty;
	private float price;
	
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
	
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public int getQty()
	{
		return qty;
	}
	
	public void setPrice(float price)
	{
		this.price=price;
	}
	public float getPrice()
	{
		return price;
	}
}

class Customer
{
	String name;
	int id;
	String address;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	
}

class Shop 
{
	Customer customer;
	Product[] product;
	
	void setProducts(Customer customer,Product... p)
	{
		this.customer=customer;
		this.product=p;
	}
	
	void findBill()
	{
//		System.out.println("Customer Details:");
//		System.out.println("===============================================");
		System.out.print("Name: " + customer.getName() + "\t");
	    System.out.print("ID: " + customer.getId()+ "\t");
	    System.out.print("Address: " + customer.getAddress() +"\t");
	    System.out.println();

		System.out.println();
		
		float totalSum = 0;
		System.out.println("Id\t\t" + "Name\t\t" + "Quantity\t" + "Price\t\t" + "Total\t");
		System.out.println("------------------------------------------------------------------------------------------");
		for(int i=0 ; i<product.length ; i++)
		{
			System.out.print(product[i].getId() + "\t\t");
			System.out.print(product[i].getName() + "\t\t");
			System.out.print(product[i].getQty() + "\t\t");
			System.out.print(product[i].getPrice() + "\t\t");			
			System.out.println(product[i].getQty() * product[i].getPrice()  + "\t\t");
			totalSum = product[i].getQty() * product[i].getPrice();
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t" + "Grand Total\t" + ":" + totalSum);
		System.out.println("------------------------------------------------------------------------------------------");
	}
}

public class Q2_Shop_App
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========================================================================");
		System.out.println("Enter how many Product Add");
		int nProduct = sc.nextInt();
		System.out.println("===========================================================================");
		
		Product[] arrP = new Product[nProduct];
		
		for(int i=0 ; i<arrP.length;i++)
		{
			System.out.println("Enter the Id");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Name");
			String name = sc.nextLine();
			
			System.out.println("Enter the Quantity");
			int qty = sc.nextInt();
			sc.nextLine();
				
			System.out.println("Enter the price");
			float price = sc.nextFloat();
			sc.nextLine();
			
			Product p = new Product();
			
			p.setId(id);
			p.setName(name);
			p.setQty(qty);
			p.setPrice(price);
			
			arrP[i] = p;
		}
		
		System.out.println("===========================================================================");
		System.out.println("Enter the Customer details");
		System.out.println("===========================================================================");

		System.out.println("Enter the Name");
		String name = sc.nextLine();
			
		System.out.println("Enter the Id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Address");
		String address = sc.nextLine();
			
		Customer c = new Customer();
		
		c.setName(name);
		c.setId(id);
		c.setAddress(address);
			
		
		Shop s = new Shop();
		s.setProducts(c, arrP);
		System.out.println("===========================================================================");
        s.findBill();
		
	}

}
