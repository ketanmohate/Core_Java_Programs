package com.java;

import java.util.*;
/*Write a java program to calculate the compound intrest*/

public class compoundIntrestAppp 
{
	public static void main(String args[])
	{
		int num , periad;
		float rate;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number/principle :");
		num = scan.nextInt();

		System.out.println("Enter the rate :");
		rate = scan.nextFloat();

		System.out.println("Enter the Time of periad :");
		periad = scan.nextInt();

		System.out.print("Enter number of times interest is compounded: ");
		int comnum = scan.nextInt();

		double interest = num * (Math.pow((1 + rate/100), (periad * comnum))) - num;
		System.out.println("Intrest is " + interest);
	}
}
