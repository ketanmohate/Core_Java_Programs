package com.java;
/* Write a c program to check whether triangle is valid or not.*/
import java.util.*;
public class TriangleValidNot
{
	public static void main (String args[])
	{
		int num;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		num = scan.nextInt();
		result = (num==180)?"Valid":"Not Valid";
		System.out.println(result);
	}
}