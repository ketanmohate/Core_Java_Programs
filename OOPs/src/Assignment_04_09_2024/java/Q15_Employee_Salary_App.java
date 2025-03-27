package Assignment_04_09_2024.java;

/*
 15) WAP to create the class name as Employee with a following setter and getter method 
and create the array of objects with a 5 elements or values and store data in it and show 
it. 
 */
import java.util.*;

class Employee
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


public class Q15_Employee_Salary_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of Employee");
		int size=sc.nextInt();
		System.out.println("-----------------------------");
		
		Employee[] arrEmployees = new Employee[size];
		
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
			
			Employee objEmployee = new Employee();
			
			objEmployee.setId(id);
			objEmployee.setName(name);
			objEmployee.setSalary(sal);
			
			arrEmployees[i] = objEmployee;
		}	
		
		System.out.println("Name\t\t" + "ID\t\t" + "Salary\t\t");
		System.out.println("=======================================");
		for(int i=0;i<arrEmployees.length;i++)
		{
			System.out.println( arrEmployees[i].getName() + "\t\t" + arrEmployees[i].getId() + "\t\t" + arrEmployees[i].getSalary());
		}
	}

}
