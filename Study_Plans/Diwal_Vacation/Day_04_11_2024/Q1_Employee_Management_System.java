package Day_04_11_2024;

/*
 * Q1. Employee Management System 
Objective: Create a system to manage different types of employees in a company. 
Requirements: 
Define a Base Class: 
Create a class named Employee with attributes such as name, id, and salary. 
Include a method displayInfo() that prints employee details. 
Implement Subclasses: 
Create a class Manager that extends Employee and adds an attribute for department. 
Override displayInfo() to include department details. 
Create a class Intern that extends Employee and adds an attribute for duration (in 
months). 
Override displayInfo() to include duration details. 
Demonstration: 
Create an array of Employee objects. 
Initialize it with instances of Manager and Intern. 
Call displayInfo() for each employee to demonstrate functionality. 
Expected Output: 
Name: Alice, ID: 001, Salary: $70000, Department: Sales 
Name: Bob, ID: 002, Salary: $30000, Duration: 6 months
 */

import java.util.*;


class Employee
{
	String name;
	int id;
	float salary;
	
	Employee(String name, int id, float salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public void displayInfo() 
	{	
		System.out.print("Employee Name:- " + name + "\t Employee Id:- " + id + "\t Employee Salary:- " + salary);
	}
}

class Manager extends Employee
{

	String department;
	
	Manager(String name, int id, float salary, String department) 
	{
		super(name, id, salary);
		this.department = department;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.print("\t Employee Department:- " + department);
	}
}

class Intern extends Employee
{

	int duration;
	
	Intern(String name, int id, float salary, int dur) 
	{
		super(name, id, salary);
		this.duration = dur;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.print("\t Employee Duration:-" + duration);
	}
}

public class Q1_Employee_Management_System 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Employee[] aEmp = new Employee[1];
		
		for(int i=0 ; i<aEmp.length ; i++)
		{
			System.out.println("Enter the Employee name");
			String eName = sc.nextLine();
			
			System.out.println("Enter the Employee Id");
			int eId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Employee Salary");
			float eSalary = sc.nextFloat();
			sc.nextLine();
			
			System.out.println("Enter the choise:- 1.Department, 2.Duration");
			int choise = sc.nextInt();
			sc.nextLine();
			
			if(choise == 1)
			{
				System.out.println("Enter the Employee Department");
				String dep = sc.nextLine();
				aEmp[i] = new Manager(eName, eId, eSalary, dep);
			}
			else if(choise ==2)
			{
				System.out.println("Enter the Employee Duration");
				int dur = sc.nextInt();
				sc.nextLine();
				aEmp[i] = new Intern(eName, eId, eSalary, dur);
			}
			else
			{
				System.out.println("Pls valid input");
			}

			aEmp[i] = new Employee(eName, eId, eSalary);
		}
		
		for(Employee e : aEmp)
		{
			e.displayInfo();
		}
	}
}
