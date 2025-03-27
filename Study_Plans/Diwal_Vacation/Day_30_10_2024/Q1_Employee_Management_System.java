package Day_30_10_2024;

/*
 * Q1. Statement: Employee Management System 
Objective: Develop a system to manage employees and calculate their salaries. 
Abstract Class Definition: 
o Create an abstract class named Employee with the following abstract 
methods: 
▪ calculateSalary(): This method should return the salary of the 
employee as a double. 
▪ displayInfo(): This method should print the details of the employee. 
Subclasses Implementation: 
o Implement two subclasses of Employee: 
▪ FullTimeEmployee 
▪ Add a constructor that takes the employee's name and 
monthly salary as parameters. 
▪ Implement the calculateSalary() method to return the 
monthly salary. 
▪ Implement the displayInfo() method to display the 
employee's name and monthly salary. 
▪ PartTimeEmployee 
▪ Add a constructor that takes the employee's name and hourly 
wage along with the number of hours worked per week as 
parameters. 
▪ Implement the calculateSalary() method to return the weekly 
salary (hourly wage multiplied by hours worked). 
▪ Implement the displayInfo() method to display the 
employee's name, hourly wage, and weekly salary. 
Array of Employees: 
o Create an array of Employee objects that includes at least one 
FullTimeEmployee and one PartTimeEmployee. 
o Loop through the array to: 
▪ Call the displayInfo() method on each employee. 
▪ Call the calculateSalary() method and display the salary. 
Example Output: 
Full-Time Employee: John Doe 
Monthly Salary: $3000.00 
Part-Time Employee: Jane Smith 
Hourly Wage: $20.00 
Weekly Salary: $200.00 
Requirements: 
• Ensure proper use of inheritance and abstraction in your implementation. 
• Use appropriate access modifiers (public, protected, etc.) where necessary. 
• The program should be designed to easily add more employee types in the future.
 */

import java.util.Scanner;

abstract class Employee 
{
    String name;

    public Employee(String name) 
    {
        this.name = name;
    }

    abstract void calculateSalary();

    abstract void displayInfo();
}

class FullTimeEmployee extends Employee 
{
    float salary;

    public FullTimeEmployee(String name, float salary) 
    {
        super(name);
        this.salary = salary;
    }

    void calculateSalary() 
    {
        System.out.println("Full-Time Employee Salary: " + salary);
    }

    void displayInfo() 
    {
        System.out.println("Full-Time Employee Name: " + name);
        System.out.println("Full-Time Employee Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee 
{
    float weeklySalary;
    int noOfHoursWorked;

    public PartTimeEmployee(String name, float weeklySalary, int noOfHoursWorked) 
    {
        super(name);
        this.weeklySalary = weeklySalary;
        this.noOfHoursWorked = noOfHoursWorked;
    }

    void calculateSalary() 
    {
        float hourlyWage = weeklySalary / noOfHoursWorked;
        System.out.println("Part-Time Employee Hourly Wage: " + hourlyWage);
    }

    void displayInfo() 
    {
        System.out.println("Part-Time Employee Name: " + name);
        System.out.println("Weekly Salary: " + weeklySalary);
        System.out.println("Hours Worked: " + noOfHoursWorked);
    }
}

public class Q1_Employee_Management_System 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Employee[] arrE = new Employee[2];

        for (int i = 0; i < arrE.length; i++) 
        {
            System.out.println("Enter the Employee Name:");
            String name = sc.nextLine();

            System.out.println("Enter your choice: 1. Full-Time Employee, 2. Part-Time Employee");
            int choice = sc.nextInt();

            if (choice == 1) 
            {
                System.out.println("Enter the Salary:");
                float salary = sc.nextFloat();
                arrE[i] = new FullTimeEmployee(name, salary);
            } 
            else if (choice == 2) 
            {
                System.out.println("Enter the Weekly Salary:");
                float weeklySalary = sc.nextFloat();

                System.out.println("Enter the Number of Hours Worked:");
                int hoursWorked = sc.nextInt();
                arrE[i] = new PartTimeEmployee(name, weeklySalary, hoursWorked);
            } 
            else 
            {
                System.out.println("Invalid choice!");
                i--; // Retry the current iteration
                sc.nextLine(); // Clear the input buffer
                continue;
            }
            sc.nextLine(); // Clear the input buffer
        }

        System.out.println("\nEmployee Details:");
        for (Employee emp : arrE) 
        {
            emp.displayInfo();
            emp.calculateSalary();
            System.out.println();
        }

        sc.close();
    }
}
