package com.java;

/* Q9. Write a java program to input basic salary of an employee and calculate its Gross salary according to following :
Basic Salary <= 10000 : HRA(House Rent Allowance) = 20%, DA(Dearness Allowance) = 80%
Basic Salary <= 20000 : HRA(House Rent Allowance) = 25%, DA(Dearness Allowance) = 90%
Basic Salary > 20000 : HRA(House Rent Allowance) = 30%, DA(Dearness Allowance) = 95% */

import java.util.*;
public class CalculateGrossSalary
{
	public static void main(String args[])
	{
			int salary ;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Salary :");
			salary = scan.nextInt();
			if(salary <= 10000)
			{
				int HRA = (salary * 20) /100;
				int DA = (salary * 80) /100;
				int Gsalary1 = salary + HRA + DA;
				System.out.println("HRA(House Rent Allowance):" + HRA );
				System.out.println("DA(Dearness Allowance):" + DA );
				System.out.println(" Gross salary is Gsalary:" + Gsalary1 );
			}
			else if(salary <= 20000)
			{
				int HRA = (salary * 25) /100;
				int DA = (salary * 90) /100;
				int Gsalary1 = salary + HRA + DA;
				System.out.println("HRA(House Rent Allowance):" + HRA );
				System.out.println("DA(Dearness Allowance):" + DA );
				System.out.println(" Gross salary is Gsalary:" + Gsalary1 );
			}
			else
			{
				int HRA = (salary * 30) /100;
				int DA = (salary * 95) /100;
				int Gsalary1 = salary + HRA + DA;
				System.out.println("HRA(House Rent Allowance):" + HRA );
				System.out.println("DA(Dearness Allowance):" + DA );
				System.out.println(" Gross salary is Gsalary:" + Gsalary1 );		
			}
	}
}
