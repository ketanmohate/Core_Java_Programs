package com.java;

public class CommandLine
{
	public static void main(String x[])
	{
		int a,b,c;
		System.out.println("Enter the first numbet:");
		a = Integer.parseInt(x[0]);
		System.out.println("Enter the secound number:");
		b = Integer.parseInt(x[1]);
		c = a + b;
		System.out.println("Addition of :"+c);
	}
}
