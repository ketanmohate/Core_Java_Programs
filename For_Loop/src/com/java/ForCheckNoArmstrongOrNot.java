package com.java;
/* 30. Write a java program to check whether a number is Armstrong number or not. using for loop */

import java.util.*;

public class ForCheckNoArmstrongOrNot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int temp = num;
		int rem;
		int sum = 0;

		for(;temp != 0;)
		{
			rem = temp % 10;
			sum = sum + rem * rem * rem;
			temp = temp / 10;
		}

		if(num == sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is Not Armstrong");
		}
	}
}
