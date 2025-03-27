package com.java;

/*
 10) WAP to create the pojo class name as Student class with a following methods and data 
or variable/state 
class Student 
{   
int id;String name;float per; 
int totalFees;int disFees; 
int actualPaidFees; 
void setId(int id) 
{ this.id=id; 
} 
int getId() 
{ return id; 
} 
void setName(String name) 
{ this.name=name; 
} 
String getName() 
{ return name; 
} 
//do setter and getter for all students 
} 
Create the class name as DiscountFees and this class is depend on Student class means in this class 
we need to write a method setStudent() and accept the reference of Student class in it  
As well as we need to define two another method in this class name as  checkDiscountEligibility(int 
per) -> this function accept the per of student if per greater than 60 then student is eligible for 
discout and give the 30% discount on fees and update in student object  
And we need to write one more function in DiscountFees class show() and in this function contain 
the logics for display the all details of Students with discounted fees 
Following sample code gives the completed structure about the two class with empty methods. 
Also create the main method class with a following operation given below. 
public class StudentDiscountApp 
{ 
public static void main(String x[ ]) 
{  //create the object of Scanner class 
//declare the variables for id,name ,per,totalFees,per and accept the input and store its value in 
variable usign scanner 
//create the object of student class and store the values in object using setter methods 
//create the object of DiscountFees class and call setStudent() method and pass student class 
reference in it 
//call the checkDiscountEligilibility() method and pass per in it accepted from keyboard 
//call show() method here 
} 
} 
 */
import java.util.*;

class StudentPojo
{
	private int id;
	private String name;
	private float per; 
	private int totalFees;
	private int disFees; 
	private int actualPaidFees;
	
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
	
	void setper(float per)
	{
		this.per=per;
	}
	float getper()
	{
		return per;
	}
	
	void settotalFees(int totalFees)
	{
		this.totalFees=totalFees;
	}
	
	int gettotalFees()
	{
		return totalFees;
	}
	
	void setdisFees(int disFees)
	{
		this.disFees=disFees;
	}
	int getdisFees()
	{
		return disFees;
	}
	
	void setactualPaidFees(int actualPaidFees)
	{
		this.actualPaidFees=actualPaidFees;
	}
	int getactualPaidFees()
	{
		return actualPaidFees;
	}
}

class DiscountFees
{
	StudentPojo Student;
	
	void setStudent(StudentPojo Student)
	{
		this.Student = Student;
	}
	
	void checkDiscountEligibility(float per)
	{
		if(per > 60)
		{
			int discount = (int) (Student.gettotalFees()*0.30);
			Student.setdisFees(discount);
			Student.setactualPaidFees(Student.gettotalFees() - discount);
		}
		else
		{
			Student.setdisFees(0);
            Student.setactualPaidFees(Student.gettotalFees());
		}
	}
	
	void show() 
	{
		System.out.println("--------------------------------------------------------------");
		System.out.println("Student Id:\t\t\t"+ Student.getId());
		System.out.println("Student Name:\t\t\t"+ Student.getName());
		System.out.println("Student Percentage:\t\t"+ Student.getper());
		System.out.println("Student Total Fees:\t\t"+ Student.gettotalFees());
		System.out.println("Student Discount Fees:\t\t"+ Student.getdisFees());
		System.out.println("Student Actual Paid Fees:\t"+ Student.getactualPaidFees());
		System.out.println("--------------------------------------------------------------");
	}
}

public class Q10_Student_Discount_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre the Id");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		
		System.out.println("Enter the Percentage");
		float per=sc.nextFloat();
		
		System.out.println("Enter the Total Fees");
		int totalFees = sc.nextInt();
		
		StudentPojo obj = new StudentPojo();
		
		obj.setId(id);
		obj.setName(name);
		obj.setper(per);
		obj.settotalFees(totalFees);
		
		DiscountFees objDiscountFees = new DiscountFees();
		objDiscountFees.setStudent(obj);
		objDiscountFees.checkDiscountEligibility(per);
		objDiscountFees.show();
	}
}
