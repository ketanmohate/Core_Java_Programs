package Secound_Section;

import java.util.*;

class Employee 
{	
	private String name;
	private String jobTitle;
	private double salary;
	
	
    public Employee(String name, String jobTitle, double salary) 
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
	
	String getName()
	{
		return name;
	}
	
	String getJobTitle()
	{
		return jobTitle;
	}
	
	double getSalary()
	{
		return salary;
	}
	
	public void updateSalary(double newSalary)
	{
		this.salary=newSalary;
	}
	
	public void applyRaise(double percentage)
	{
		this.salary += this.salary * (percentage /100);
	}
	
	public boolean hasHigherSalary(Employee other) {
        return this.salary > other.salary; // Return true if current employee has a higher salary
    }
	
    public boolean isEligibleForBonus() 
    {
        return this.salary > 50000;
    }
    
    public String getFormattedSalary() 
    {
        return String.format("$%,.2f", salary);
    }

    public void displayInfo() 
    {
        System.out.println(name +"\t\t\t" + jobTitle +"\t\t\t" + getFormattedSalary());
    }
}

public class Q2_Employee_Reports_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many Employee add");
		int nEmp=sc.nextInt();
		sc.nextLine();
		System.out.println("------------------------------");

		Employee[] emp = new Employee[nEmp];

		for(int i=0;i<emp.length;i++) 
		{
		    System.out.println("Enter the Name");
		    String name=sc.nextLine();
		    
		    System.out.println("Enter the Job Title");
		    String jobTitle=sc.nextLine();
		    
		    System.out.println("Enter the Salary");
		    double salary=sc.nextDouble();
		    sc.nextLine();
		    
		    emp[i] = new Employee(name,jobTitle,salary);
		    System.out.println("--------------------------------");
		}
		
		System.out.println("Initial Employee Information:");
		System.out.println("----------------------------------");
    	System.out.println("Employee Name \t\t" + "Job Title \t\t" + "Salary");
    	System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < emp.length; i++) 
        {
            emp[i].displayInfo();
        }
		
		System.out.println("-------------------------------------");
		System.out.println("Do you Want To Update Any Salary(Y/N)");
		String ch=sc.nextLine();
		if(ch.length() > 0 && (ch.charAt(0) == 'Y' || ch.charAt(0) == 'y'))
		{
			System.out.println("Enter the Name of Employee");
			String name=sc.nextLine();
			
			if(emp != null)
			{
				boolean found = false;
				for(int i=0;i<emp.length;i++)
				{
					if(emp[i] != null)
					{
						if(emp[i].getName().equals(name))
						{
							found = true;
							System.out.println("Enter the New salary");
							double nSalary=sc.nextDouble();
							sc.nextLine();
							emp[i].updateSalary(nSalary);
							System.out.println("------------------------------");
							System.out.println("Update Successfully");
							System.out.println("------------------------------");
					    	System.out.println("Employee Name \t\t" + "Job Title \t\t" + "Salary");
					    	System.out.println("-------------------------------------------------------------");
							emp[i].displayInfo();
						}
					}
				}
				if(found == false)
				{
					System.out.println("Record not found");
				}
			}
		}
		
		System.out.println("-------------------------------------");
		System.out.println("Do you Want To Raise Any Salary(Y/N)");
		String chh=sc.nextLine();
		if(chh.length() > 0 && (chh.charAt(0) == 'Y' || chh.charAt(0) == 'y'))
		{
			System.out.println("Enter the Name of Employee");
			String name=sc.nextLine();
			
			boolean found = false;
			for(int i=0;i<emp.length;i++)
			{
				if(emp[i] != null)
				{
					if(emp[i].getName().equals(name))
					{
						found = true;
						System.out.println("Enter raise percentage");
						double raisepercentage=sc.nextDouble();
						sc.nextLine();
						emp[i].applyRaise(raisepercentage);
						System.out.println("------------------------------");
						System.out.println("Raise Successfully");
						System.out.println("------------------------------");
				    	System.out.println("Employee Name \t\t" + "Job Title \t\t" + "Salary");
				    	System.out.println("-------------------------------------------------------------");
						emp[i].displayInfo();
					}
				}
			}
			if(found == false)
			{
				System.out.println("Record not found");
			}
		}
		
		// Assuming there is at least one employee
		Employee highestSalaryEmp = emp[0];  // Initialize with the first employee

		for (int i = 1; i < emp.length; i++) 
		{
		    if (emp[i].hasHigherSalary(highestSalaryEmp)) 
		    {
		        highestSalaryEmp = emp[i];  // Update if the current employee has a higher salary
		    }
		}
		System.out.println("-----------------------------------");
		System.out.println("Employee with the highest salary:");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Employee Name \t\t" + "Job Title \t\t" + "Salary");
		System.out.println("-------------------------------------------------------------");
		highestSalaryEmp.displayInfo();
		
        System.out.println("-----------------------------------");
        System.out.println("Employee eligible for bonus:");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Employee Name \t\t" + "Job Title \t\t" + "Salary");
        System.out.println("-------------------------------------------------------------");
		for(int i=0; i<emp.length; i++)
		{
		    if(emp[i].isEligibleForBonus()) 
		    {
		        emp[i].displayInfo();
		    }
		}
	}
}