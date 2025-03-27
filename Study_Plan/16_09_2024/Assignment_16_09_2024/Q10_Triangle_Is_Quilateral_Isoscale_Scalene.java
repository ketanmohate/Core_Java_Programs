package Assignment_16_09_2024;

/* Example10  Write a C program to input sides of a triangle and check whether a triangle is equilateral, scalene or 
isosceles triangle using if else. How to check whether a triangle is equilateral, scalene or isosceles 
triangle in C programming. Logic to classify triangles as equilateral, scalene or isosceles triangle if 
sides are given in C program. 
Example 
Input 
Input first side: 30 
Input second side: 30 
Input third side: 30 
Output 
Triangle is equilateral triangle */

import java.util.*;
public class Q10_Triangle_Is_Quilateral_Isoscale_Scalene
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the three Side of triangle:");
		
		double side1 = scan.nextDouble();
		double side2 = scan.nextDouble();
		double side3 = scan.nextDouble();
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