package com.java;

/*write a java program to find the area of triangle. (take input as command line 
argument) */

public class AreaOfTriangle
{
	public static void main(String x[])
	{
		float height,base,area;
		System.out.println("Enter the height:");
		height = Integer.parseInt(x[0]);
		System.out.println("Enter the base:");
		base = Integer.parseInt(x[1]);
		area = (height * base)/2;
		System.out.println("The area of triangle is:" + area);
	}
}