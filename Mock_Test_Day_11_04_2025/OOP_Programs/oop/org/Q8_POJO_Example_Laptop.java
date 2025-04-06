package oop.org;

/*
Q8. WAP to create POJO class name as Laptop with field id, name ,price and ram space,hard disk space etc and 
input the details of laptop and display it
 */

import java.util.*;

class Laptop
{
	private int id;
	private String name;
	private int price;
	private int RAMSpace;
	private int hardDiskSpace;
	
	Laptop()
	{
		
	}
	
	Laptop(int id, String name, int price, int RAMSpace, int hardDiskSpace)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.RAMSpace = RAMSpace;
		this.hardDiskSpace = hardDiskSpace;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRAMSpace() {
		return RAMSpace;
	}
	public void setRAMSpace(int rAMSpace) {
		RAMSpace = rAMSpace;
	}
	public int getHardDiskSpace() {
		return hardDiskSpace;
	}
	public void setHardDiskSpace(int hardDiskSpace) {
		this.hardDiskSpace = hardDiskSpace;
	}
	
	public void Display()
	{
		System.out.println("Id:\t" + this.getId());
		System.out.println("Name:\t" + this.getName());
		System.out.println("Price:\t" + this.getPrice());
		System.out.println("RAM Space:\t" + this.getRAMSpace());
		System.out.println("Hard DiskS Pace:\t" + this.getHardDiskSpace());
	}
}

public class Q8_POJO_Example_Laptop {

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
		
		System.out.println("Enter the RAM Space");
		int RAMSpace = sc.nextInt();
		
		System.out.println("Enter the Hard Disk Space");
		int hardDiskSpace = sc.nextInt();
		
		Laptop lp = new Laptop(id,name,price,RAMSpace,hardDiskSpace);
		lp.Display();
	}

}
