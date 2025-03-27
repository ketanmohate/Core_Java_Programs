package Assignment_13_09_2024;

/*
 Q 2.  Write a java Program to calculate overtime pay of 5 employees. 
The overtime pay rate is Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 
Note- for a week only 40 hours of working are allowed.			

1. Create class Employee with data member ID, Name, total working, salary, 
overtime Set Information by using a setDetails() method and 
create a display Information() method to display all information with salary.

2. Create another class name as OverTime with method setEmployee(Employee emp[ ]) 
and void calculateOvertime() to calculate overtime. 
	
 */

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Employee
{
	int id;
	String name;
	int totalWorking;
	long salary;
	int overtime;
	
	void setDetails(int id, String name, int totalWorking , long salary ,int overtime)
	{
		this.id=id;
		this.name=name;
		this.totalWorking=totalWorking;
		this.salary=salary;
		this.overtime=overtime;
	}
	
	void Information()
	{
		System.out.println("ID\t\t\t" + id);
		System.out.println("Name\t\t\t" + name);
		System.out.println("Total Working\t\t" + totalWorking);
		System.out.println("Salary\t\t\t" + salary);
		System.out.println("Overtime\t\t" + overtime);
	}
}

class OverTime
{
	Employee[] emp;
	
	void setEmployee(Employee emp[ ])
	{
		this.emp = emp;
	}
	void calculateOvertime()
	{
		int regularHours = 40;
		double overtimePayRate = 135	; 
		for (int i = 0; i < emp.length; i++)
		{
			if(emp[i].totalWorking>regularHours)
			{
				emp[i].overtime = emp[i].totalWorking - regularHours;
				emp[i].salary = (long) ((regularHours * overtimePayRate) + (emp[i].overtime * overtimePayRate));
			}
			else 
			{
				emp[i].overtime = 0;
	            emp[i].salary = (long) (emp[i].totalWorking * overtimePayRate); // No overtime, just base pay
	        }
		}
	}
}

public class Employee_Overtime_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of Employee");
		int nEmployee = sc.nextInt();
		
//		Employee[] arrEmp = null;
		
		Employee[] arrEmp = new Employee[nEmployee];
	
		
		for(int i=0 ;i<arrEmp.length;i++)
		{
			System.out.println("==============================================================");
			System.out.println("Enter the " + (i+1) + " Employee Details");
			System.out.println("==============================================================");
			
			System.out.println("Enter the Id of Employee");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter the Name of Employee");
			String name = sc.nextLine();
			
			System.out.println("Enter the Toatal Working of Employee");
			int totalWorking = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Salary of Employee");
			long salary = sc.nextLong();
			sc.nextLine();
			
			System.out.println("Enter the Overtime of Employee");
			int overtime = sc.nextInt();
			sc.nextLine();
			
			Employee emp = new Employee();
			emp.setDetails(id, name, totalWorking, salary, overtime);
			
			arrEmp[i] = emp;
		}	
		System.out.println("==============================================================");
		for(int i=0 ;i<arrEmp.length;i++)
		{
			System.out.println("--------------------------------------------------------------");
			System.out.println("Displye the " + (i+1) + " Employee Details");
			System.out.println("--------------------------------------------------------------");
			arrEmp[i].Information();
		}
		
		OverTime OTime = new OverTime();
		OTime.setEmployee(arrEmp);
		OTime.calculateOvertime();
		
		 // Display employee details after calculating salary
		System.out.println("==============================================================");
		System.out.println("Display employee details after calculating salary");
		System.out.println("==============================================================");
		for(int i=0; i<arrEmp.length;i++)
		{
			System.out.println("--------------------------------------------------------------");
			arrEmp[i].Information();
		}
	}

}
