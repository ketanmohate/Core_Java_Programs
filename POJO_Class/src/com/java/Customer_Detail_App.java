package com.java;

/*
 Example: WAP to create billing application you have to design the following classes 
Create class name as Product with field id, name and price, qty and mark this class as POJO class and create one class name as Shop with two methods 
void setProducts(Customer c,Product …p): this method can accept infinite products 
Customer POJO class with field id,name and address ,contact 
void calBill(): this method can calculate bill  and your bill format like as 
 */

import java.util.*;

class Product
{
	private long id ;
	private long price;
	private long qty;
	private String name;
	
	public void setid(long id)
	{
		this.id=id;
	}
	public long getid()
	{
		return id;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	
	public void setprice(long price)
	{
		this.price=price;
	}
	public long getprice()
	{
		return price;
	}
	
	public void setqty(long qty)
	{
		this.qty=qty;
	}
	public long getqty()
	{
		return qty;
	}	
}

class Customer 
{
	long Cid ;
	long contact;
	String Cname ;
	String Caddress;
	
	public void setCid(long Cid)
	{
		this.Cid=Cid;
	}
	public long getCid()
	{
		return Cid;
	}
	
	public void setcontact(long contact)
	{
		this.contact=contact;
	}
	public long getcontact()
	{
		return contact;
	}
	
	public void setCname(String Cname)
	{
		this.Cname=Cname;
	}
	public String getCname()
	{
		return Cname;
	}
	
	public void setCaddress(String Caddress)
	{
		this.Caddress=Caddress;
	}
	public String getCaddress()
	{
		return Caddress;
	}
}

class Shop
{
	private long total ;
	private long totalbill;
	
	Product[] product;
	void setProduct(Product ...p)
	{
		product = p;
	}
	
//	void calBill()
//	{
//		total = price * qty;
//		
//		for(int i =1 ; i <=  ;i++)
//		{
//			totalbill = totalbill + total;
//		}
//	}
	
}

public abstract class Customer_Detail_App 
{
	public static void main(String[] args) 
	{
		Shop s1 = new Shop();

		Product p1=new Product();
		p1.setid(1);
		p1.setname("ABC");
		p1.setprice(10);
		p1.setqty(10);

		Product p2=new Product();
		p2.setid(1);
		p2.setname("MNO");
		p2.setprice(20);
		p2.setqty(10);
		
		s1.setProduct(p1,p2);
//		s1.calBill();
		
		Customer c1 = new Customer();
		c1.setCid(1);
		c1.setcontact(10101010);
		c1.setCname("xyz");
		c1.setCaddress("pune");
	}
}
