package Assignment_18_09_2024;

/*
 Q.5 WAP to Create a class name as Employee with a parameterised constructor and two function void CalSal( ) and void showDetails( ).

Employee(int id,char name[ ],char contact[ ],int presentday,int perdaysal)
{
// this constructor can store the all data in instance variable of class.
}

void CalSal( ) 
{
//here need to write the logic for calculate the salary of employee as per his present days.
}

void showDetails()
{
//here show the all details of employee.
}
 */

import java.util.*;

class Employee 
{
	int id ;
	String name ;
	String contact ;
	int presentday ;
	int perdaysal;
	int totalSalary;
	
	public Employee(int id ,String name ,String contact ,int presentday, int perdaysal)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.presentday=presentday;
		this.perdaysal=perdaysal;
	}
	
	void CalSal()
	{
		totalSalary = presentday * perdaysal;
	}
	
	void showDetails()
	{
		System.out.println("------------------------------------");
		System.out.println("Employee ID:\t\t " + id);
        System.out.println("Employee Name:\t\t " + name);
        System.out.println("Contact:\t\t " + contact);
        System.out.println("Present Days:\t\t " + presentday);
        System.out.println("Per Day Salary:\t\t " + perdaysal);
        System.out.println("Total Salary:\t\t " + totalSalary);
        System.out.println("------------------------------------");
	}
}

public class Q5_Employee_Salary_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ID");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name");
		String name=sc.nextLine();
		
		System.out.println("Enter the Contact");
		String contact=sc.nextLine();
		
		System.out.println("Enter the present day");
		int presentday=sc.nextInt();
		
		System.out.println("Enter the per day salary");
		int perdaysal=sc.nextInt();
		
		Employee obj = new Employee(id, name, contact, presentday, perdaysal);
		obj.CalSal();
		obj.showDetails();
		
	}

}
