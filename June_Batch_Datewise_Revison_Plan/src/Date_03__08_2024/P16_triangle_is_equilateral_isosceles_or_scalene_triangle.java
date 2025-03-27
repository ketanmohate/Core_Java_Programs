package Date_03__08_2024;

/* 16.Write a C program to check whether the triangle is equilateral, isosceles or scalene triangle. */

import java.util.*;

public class P16_triangle_is_equilateral_isosceles_or_scalene_triangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side1 of Triangle:");
		double side1 = sc.nextDouble();
		
		System.out.println("Enter the side2 of Triangle:");
		double side2 = sc.nextDouble();
		
		System.out.println("Enter the side3 of Triangle");
		double side3 = sc.nextDouble();
		
		if(side1 == side2 && side1 == side3 && side2 == side3)
		{
			System.out.println("This is equilateral Triangle");
		}
		else if(side1 == side2 || side1 == side3 || side2 == side3)
		{
			System.out.println("This is isosceles Triangle");
		}
		
		else if(side1 != side2 && side1 != side3 && side2 != side3)
		{
			System.out.println("Thid is scalene Triangle");
		}
		else
		{
			System.out.println("Invalid inpute");
		}
	}

}
