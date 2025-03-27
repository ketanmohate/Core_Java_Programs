package Test;

import java.util.Scanner;

abstract class Employee 
{
    abstract void calculateSalary();

    abstract void displayEmployeeDetails();
}

class FullTimeEmployee extends Employee 
{
	int employeeId;
    float salary;
	float bonusPercentage;
	String name;

    public FullTimeEmployee(int employeeId, String name, float salary, float bonusPercentage) 
	{		
		this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
		this. bonusPercentage = bonusPercentage;
    }

    void calculateSalary() 
    {
        System.out.println("Full-Time Employee Salary: " + (salary+bonusPercentage));
    }

    void displayEmployeeDetails() 
    {
		System.out.println("Full-Time Employee Id: " + employeeId);
        System.out.println("Full-Time Employee Name: " + name);
        System.out.println("Full-Time Employee Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee 
{
	int employeeId;
    float salary;
    int noOfHoursWorked;
	String name;

    public PartTimeEmployee(int employeeId, String name, float salary, int noOfHoursWorked) 
    {

		this.employeeId = employeeId;		
		this.name = name;
        this.salary = salary;
        this.noOfHoursWorked = noOfHoursWorked;
    }

    void calculateSalary() 
    {
        float hourlyWage = salary / noOfHoursWorked;
        System.out.println("Part-Time Employee Hourly Wage: " + hourlyWage);
    }

    void displayEmployeeDetails() 
    {
		System.out.println("Full-Time Employee Id: " + employeeId);
        System.out.println("Part-Time Employee Name: " + name);
        System.out.println("Weekly Salary: " + salary);
        System.out.println("Hours Worked: " + noOfHoursWorked);
    }
}

public class EmployeePayrollSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Employee[] arrE = new Employee[2];

        for (int i = 0; i < arrE.length; i++) 
        {
			System.out.println("Enter the Employee Id:");
			int employeeId = sc.nextInt();
			sc.nextLine();
			
            System.out.println("Enter the Employee Name:");
            String name = sc.nextLine();

            System.out.println("Enter your choice: 1. Full-Time Employee, 2. Part-Time Employee");
            int choice = sc.nextInt();

            if (choice == 1) 
            {
                System.out.println("Enter the Salary:");
                float salary = sc.nextFloat();
				sc.nextLine();
				
				System.out.println("Enter the bonus:");
                float bonusPercentage = sc.nextFloat();
			
				
                arrE[i] = new FullTimeEmployee(employeeId, name, salary, bonusPercentage);
				
            } 
            else if (choice == 2) 
            {
                System.out.println("Enter the Salary:");
                float salary = sc.nextFloat();

                System.out.println("Enter the Number of Hours Worked:");
                int hoursWorked = sc.nextInt();
                arrE[i] = new PartTimeEmployee(employeeId, name, salary, hoursWorked);
            } 
            else 
            {
                System.out.println("Invalid choice!");
                i--; // Retry the current iteration
                sc.nextLine(); 
                continue;
            }
            sc.nextLine(); 
        }

        System.out.println("\nEmployee Details:");
        for (Employee emp : arrE) 
        {
            emp.displayEmployeeDetails();
            emp.calculateSalary();
            System.out.println();
        }
    }
}
