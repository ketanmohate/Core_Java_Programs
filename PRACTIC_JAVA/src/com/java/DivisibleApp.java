package com.java;

/* Write a C program to check whether a number is divisible by 5 and 11 or not..*/
import java.util.*;
public class DivisibleApp
{
	public static void main(String[]x)
	{
		int num;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		result = (num%5==0)?((num%11==0)?"number is dividible by 5":"number is dividible by 11"):"number is not Divisible by 5 or 11";
		System.out.println(result);
	}
}
