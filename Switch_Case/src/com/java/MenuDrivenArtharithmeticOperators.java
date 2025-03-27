package com.java;
/* Q.3 Write a menu driven program for following

1. Addition

2. Subtraction

3. Multiplication

4. Division */

import java.util.*;
public class MenuDrivenArtharithmeticOperators
{
	public static void main(String args[])
	{
		int choise;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choise");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		choise = scan.nextInt();
		
		int num1,num2;
		
		switch (choise)
		{
			case 1:
				System.out.println("Enter the tow number:");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				int Addition = num1 + num2;
				System.out.println("Addition is :" + Addition);
				break;
			case 2:
				System.out.println("Enter the tow number:");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				int Subtraction = num1 - num2;
				System.out.println("Subtraction is :" + Subtraction);
				break;
			case 3:
				System.out.println("Enter the tow number:");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				int Multiplication = num1 * num2;
				System.out.println("Multiplication is :" + Multiplication);
				break;
			case 4:
				System.out.println("Enter the tow number:");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				int Division = num1 / num2;
				System.out.println("Division is :" + Division);
				break;
			default:
				System.out.println("Invalid");
		}
	}
}