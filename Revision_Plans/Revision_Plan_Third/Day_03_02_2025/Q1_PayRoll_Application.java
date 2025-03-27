package Day_03_02_2025;

import java.util.*;

class Employee
{
	private int id;
	private String name;
	private int presentDay;
	private float perDaySalary;
	private float totalSalary;
	
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
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setPresentDay(int presentDay)
	{
		this.presentDay = presentDay;
	}
	public int getPresentDay()
	{
		return presentDay;
	}
	
	public void setPerDaySalary(float perDaySalary)
	{
		this.perDaySalary=perDaySalary;
	}
	public float getPerDaySalary()
	{
		return perDaySalary;
	}
	
	public void setTotalSalary(float totalSalary)
	{
		this.totalSalary=totalSalary;
	}
	public float getTotalSalary()
	{
		return totalSalary;
	}
	
}

abstract class EmployeeFinder
{
	abstract Employee searchByName(String n);
	abstract Employee[] getAllEmployees();
	abstract Employee[] getEmpAttandWise();
	
	Employee[] emp;
	
	abstract void setEmployee(Employee emp[]);

}

class EmployeeFinderAdapter extends EmployeeFinder
{
	Employee[] emp;
	
	void setEmployee(Employee[] emp) 
	{
		this.emp=emp;
	}
	
	Employee searchByName(String n) 
	{
		return null;
	}

	Employee[] getAllEmployees() 
	{
		System.out.println("==================================");
		System.out.println("Dispay All Employee");
		System.out.println("==================================");
		
		for(int i=0 ; i<emp.length ; i++)
		{
			System.out.println("Id \t\t"+emp[i].getId());
			System.out.println("Name \t\t"+emp[i].getName());
			System.out.println("Present Day \t"+emp[i].getPresentDay());
			System.out.println("Per Day Salary \t"+emp[i].getPerDaySalary());
			System.out.println("Total Salary \t"+emp[i].getTotalSalary());
			System.out.println("----------------------------------------------------");
		}
		return emp;
	}

	Employee[] getEmpAttandWise() 
	{
		return null;
	}

}


class CompanyHelper
{
	void employeeFinder(EmployeeFinder[] ef)
	{
		
	}
	
	void displayEmployee(EmployeeFinder[] ef)
	{
		
	}
	
	void attendanceFinder(EmployeeFinder[] ef)
	{
		
	}
}


public class Q1_PayRoll_Application 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		Employee[] aEmp = null; 
		
		do
		{
			
			System.out.println("==================================================");
			System.out.println("Menu List");
			System.out.println("==================================================");
			
			System.out.println("Case 1: Add New Employees");
			System.out.println("Case 2: View All Employee");
			System.out.println("Case 3: Search Employee by Name");
			System.out.println("Case 4: Calculate Employee Salary");
			System.out.println("Case 5: Show the employee who present is more than 90%");
			System.out.println("----------------------------------------------------------");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			System.out.println("-----------------------------------------");
			
			switch(choice)
			{
				case 1:
					System.out.println("How many Records Add");
					int nRecords = sc.nextInt();
					sc.nextLine();
					System.out.println("------------------------------------------------");
					
					aEmp = new Employee[nRecords];
					
					for(int i=0 ; i<aEmp.length ; i++)
					{
						System.out.println("Enter the Id");
						int id = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Enter the Name");
						String name = sc.nextLine();
						
						System.out.println("Enter the Present Day");
						int presentDay = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Enter the Per Day Salary");
						float perDaySalary = sc.nextFloat();
						sc.nextLine();
						
						System.out.println("Enter the Total Salary");
						float totalSalary = sc.nextFloat();
						sc.nextLine();
						
						System.out.println("----------------------------");
						
						Employee emp = new Employee();
						
						emp.setId(id);
						emp.setName(name);
						emp.setPresentDay(presentDay);
						emp.setPerDaySalary(perDaySalary);
						emp.setTotalSalary(totalSalary);
						
						aEmp[i] = emp;
						
					}
					break;
					
				case 2:
					CompanyHelper ch = new CompanyHelper();
					ch.displayEmployee(aEmp);
					break;
					
				case 3:
					ch = new CompanyHelper();
					ch.employeeFinder(aEmp);
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
					default:
						System.out.println("Enter valid input");
			}
			
		}while(flag==true);
		
		
	}
}