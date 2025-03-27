package com.java;

/*Q8. Write a java program to find maximum between three numbers.*/

import java.util.*;
public class MaxBetweenThree
{
	public static void main(String args[])
	{
		int num1,num2,num3 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the three number :");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("Max number is :" + num1);
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("Max number is :" + num2);
		}
		else 
		{
			System.out.println("Max number is :" + num3);
		}
	}
} 