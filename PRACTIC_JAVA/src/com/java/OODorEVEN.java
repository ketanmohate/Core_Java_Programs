package com.java;
/*Write a c program to check whether number is even or odd.*/
import java.util.*;
public class OODorEVEN
{
	public static void main(String x[])
	{
		int num;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		result = (num%2==0)?"Number is Even":"Number is odd";
		System.out.println(result);
	}
}

