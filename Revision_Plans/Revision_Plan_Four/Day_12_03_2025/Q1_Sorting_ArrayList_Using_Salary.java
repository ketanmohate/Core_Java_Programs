package Day_12_03_2025;

/*
 Q1. Sorting an ArrayList
Create an ArrayList of custom objects and sort them using Collections.sort() based on a specific field.
Example: you have to create Employee class with field id,
name and salary and sort employee data by using salary
 */

import java.util.*;

class Employee
{
	private int id;
	private String name;
	private double salary;
	
	Employee()
	{
		
	}
	Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void setId(int id)
	{
		this.id = id;
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
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public String toString() {
		return "id: " +id + "\t" +"Name: " + name + "\t"+"Salary: "+ salary ;
	}
}

public class Q1_Sorting_ArrayList_Using_Salary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many record inset");
		int size = sc.nextInt();
		
		List<Employee> arrList = new ArrayList<Employee>();
		
		for(int i=0 ; i<size; i++)
		{
			System.out.println("Enter Id");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Name");
			String name = sc.nextLine();
			
			System.out.println("Enter Salary");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			arrList.add(new Employee(id,name,salary));
		}
		
		Collections.sort(arrList, Comparator.comparingDouble(Employee::getSalary));
		
		for(Employee arrlist : arrList)
		{
			System.out.println(arrlist);
		}
	}
}