package com.java;
import java.util.*;
/*Write a java program to calculate the simple intrest.*/

public class SimpleIntrest 
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
		float intrest = (num*rate*periad)/100;
		System.out.println("Intrest is " + intrest);
	}
}
