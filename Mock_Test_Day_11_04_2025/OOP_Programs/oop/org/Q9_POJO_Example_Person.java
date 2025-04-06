package oop.org;

/*
 * Q9. WAP to create class name as Person with field id,name,age and address and input data and display it
 */

import java.util.*;

class Person
{
	private int id;
	private String name;
	private int age;
	private String address;
	
	Person()
	{
		
	}
	
	Person(int id, String name, int age, String address)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void Display()
	{
		System.out.println("Id:\t" + this.getId());
		System.out.println("Name:\t" + this.getName());
		System.out.println("Age:\t" + this.getAge());
		System.out.println("Address:\t" + this.getAddress());
	}
}

public class Q9_POJO_Example_Person {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ID");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the address");
		String address = sc.nextLine();
		
		Person person = new Person(id,name,age,address);
		person.Display();
	}

}
