package com.java;	

import java.util.Scanner;

class Employee2
{
	private int id;
	private String name;
	private int sal;
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	
	void setSalary(int sal)
	{
		this.sal=sal;
	}
	int getSalary()
	{
		return sal;
	}
}

public class Q17_Employee_Salary_App2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of Employee");
		int size=sc.nextInt();
		System.out.println("-----------------------------");
		
		Employee2[] arrEmployees = new Employee2[size];
		
		for(int i=0;i<arrEmployees.length;i++)
		{
			System.out.println("Enter the " +(i+1) +" Employee Detail");
			System.out.println("-----------------------------");
			System.out.println("Enter the Id");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Name");
			String name=sc.nextLine();
			
			System.out.println("Enter the Salary");
			int sal=sc.nextInt();
			System.out.println("----------------------------------");
			
			Employee2 objEmployee2 = new Employee2();
			
			objEmployee2.setId(id);
			objEmployee2.setName(name);
			objEmployee2.setSalary(sal);
			
			arrEmployees[i] = objEmployee2;
		}	
		
		System.out.println("=======================================");
		System.out.println("Display Employe All Details");
		System.out.println("=======================================");
		
		System.out.println("Name\t\t" + "ID\t\t" + "Salary\t\t");
		System.out.println("=======================================");
		for(int i=0;i<arrEmployees.length;i++)
		{
			System.out.println( arrEmployees[i].getName() + "\t\t" + arrEmployees[i].getId() + "\t\t" + arrEmployees[i].getSalary());
		}
		System.out.println("---------------------------------------");
		
		
		System.out.println("Enter the Id of the Employee to Delete Record");
		int id=sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<arrEmployees.length;i++)
		{
			if(arrEmployees[i] != null && arrEmployees[i].getId() == id)
			{
				arrEmployees[i]=null;
				found=true;
				System.out.println("Employee with ID " + id + " is deleted.");
                break;
			}
		}
		if(found==true)
		{
			System.out.println("Employee with ID " + id + " not found.");
		}
		
		System.out.println("=======================================");
		System.out.println("After Delet Display Employe All Details");
		System.out.println("=======================================");
		
		System.out.println("Name\t\t" + "ID\t\t" + "Salary\t\t");
		System.out.println("=======================================");
		
		if(arrEmployees != null)
		{
			for(int i=0;i<arrEmployees.length;i++)
			{
				if(arrEmployees[i] != null)
				{
					System.out.println( arrEmployees[i].getName() + "\t\t" + arrEmployees[i].getId() + "\t\t" + arrEmployees[i].getSalary());
				}
			}
		}
	}

}
