package Date_03__08_2024;

/* 15.Write a C program to input all sides of a triangle and check whether triangle is valid or not. */

import java.util.*;

public class P15_triangle_is_valid_or_not
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
		
		if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1))
		{
			System.out.println("Valid Triangle");
		}
		else
		{
			System.out.println("Invalid Triangle");
		}
	}

}
