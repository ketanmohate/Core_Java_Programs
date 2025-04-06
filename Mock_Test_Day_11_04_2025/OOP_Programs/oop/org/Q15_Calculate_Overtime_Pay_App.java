package oop.org;

/*
 * Q15.  Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is 
	Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 
			
Note- for a week only 40 hours of working are allowed. 
1. Create class Employee with data member ID, Name, total working, salary, overtime
Set Information by using a constructor and create a display Information() method to
display all information with salary.
2. Create Driver class name as OverTime with method setEmployee(Employee emp[]) and 
void calculateOvertime() to calculate overtime. 
 */

import java.util.*;

class Employee
{
	private int id;
	private String name;
	private int totalWorking;
	private double salary;
	private int overTime;
	
	Employee()
	{
		
	}
	
	Employee(int id, String name, int totalWorking, double salary , int overTime)
	{
		this.id = id;
		this.name = name;
		this.totalWorking = totalWorking;
		this.salary = salary;
		this.overTime = overTime;
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

	public int getTotalWorking() {
		return totalWorking;
	}

	public void setTotalWorking(int totalWorking) {
		this.totalWorking = totalWorking;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getOverTime() {
		return overTime;
	}

	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}

	void displayInformation(Employee emp[])
	{
		System.out.println("ID\t" + "Name\t" + "Total_Working\t" + "Salary\t\t" + "Over_Time");
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].getId() + "\t" + emp[i].getName() + "\t" + emp[i].getTotalWorking() + "\t\t" + emp[i].getSalary() + "\t\t" + emp[i].getOverTime());
		}
	}
}

class OverTime
{
	Employee[] emp;
	void setEmployee(Employee emp[])
	{
		this.emp = emp;
	}
	
	void calculateOvertime() 
	{
		for (int i = 0; i < emp.length; i++) 
		{
			if((emp[i].getOverTime() + emp[i].getTotalWorking()) <=40)
			{
				int total = emp[i].getOverTime();
				emp[i].setSalary(total + emp[i].getSalary());
			}
			else if((emp[i].getOverTime() + emp[i].getTotalWorking()) >40)
			{
				int total = 40 - emp[i].getTotalWorking();
				total = total * 50;
				emp[i].setSalary(total + emp[i].getSalary());
			}
		}
	}
}

public class Q15_Calculate_Overtime_Pay_App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numner of Emplyee");
		int nEmp = sc.nextInt();
		
		Employee[] employee = new Employee[nEmp];
		
		for (int i = 0; i < employee.length; i++) 
		{
			System.out.println("Enter the Id");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Name");
			String name = sc.nextLine();
			
			System.out.println("Enter the total working");
			int totalWorking = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Salary");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Enter the over time");
			int overTime = sc.nextInt();
			sc.nextLine();
			
			employee[i] = new Employee(id,name,totalWorking,salary,overTime);
		}
		
		OverTime overTime = new OverTime();
		overTime.setEmployee(employee);
		
		overTime.calculateOvertime();
		
		Employee emp = new Employee();
		
		emp.displayInformation(employee);
		
	}

}
