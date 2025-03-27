package com.java;

/*Write a C program to find maximum between three numbers.*/
import java.util.*;
public class MaxNumberThree
{
	public static void main(String args[])
	{
		int a,b,c,d;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Three number:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
		System.out.println("MAX number is:"+d);
	}
}
