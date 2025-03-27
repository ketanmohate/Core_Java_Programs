package com.java;
/* Write a Java  program to create Simple Calculator using switch case.*/

import java.util.*;

public class CalculatorApp
{
	public static void main(String args[])
	{
		int choise ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you'r choise");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Percentage / Modulo");
		
		choise = scan.nextInt();
		
		System.out.println("Enter the 1St number:");
		int num1 = scan.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = scan.nextInt();
			
		int result;
		
		switch(choise)
		{
			case 1: 
				result = num1 + num2;
				System.out.println("Addition:" + result);
				break;
			case 2:
				result = num1 - num2;
				System.out.println("Subtraction:" + result);
				break;
			case 3:
				result = num1 * num2 ;
				System.out.println("Multiplication:" + result);
				break;
			case 4:
				result = num1 / num2;
				System.out.println("Division:" + result);
				break;
			case 5:
				result = num1 % num2;
				System.out.println("Percentage / Modulo:" + result);
				break;
			default:
				System.out.println("Invalid");
		}
	}
}