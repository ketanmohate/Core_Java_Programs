package com.java;

/*Write a java program to calculate the simple intrest.*/
import java.util.*;
public class CalSimpleIntrest
{
	public static void main(String[]xyz)
	{
		int num;
		float intrest,result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		System.out.println("Enter the intrest:");
		intrest = scan.nextFloat();
		result = num/100*intrest;
		System.out.println("The intrest is :" + result);
	}
}