package com.java;

/*Q4.Write a c program to check whether triangle is equilateral , isoscale  or scalene.*/

import java.util.*;
public class QuilateralOrIsoscaleOrScalene
{
	public static void main(String args[])
	{
		double side1,side2,side3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the three Side of triangle:");
		side1 = scan.nextDouble();
		side2 = scan.nextDouble();
		side3 = scan.nextDouble();
		if(side1 == side2 && side1 == side3)
		{
			System.out.println("Triangle is equilateral");
		}
		else if(side1 == side2 || side2 == side3 || side1 == side3)
		{
			System.out.println("Triangle is isoscale");
		}
		else 
		{
			System.out.println("Trian gle is scalene");
		}
	}
}