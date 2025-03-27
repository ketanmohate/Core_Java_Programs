package com.java;
/*Write a C program to find maximum between two numbers.*/

import java.util.*;
public class MaxNumberTwo {
	public static void main(String args[])
	{
		int x,y,z;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two value:");
		x = scan.nextInt();
		y = scan.nextInt();
		z = (x>y)?x:y;
		System.out.println("The Max number is :" +z);
	
	}
}
