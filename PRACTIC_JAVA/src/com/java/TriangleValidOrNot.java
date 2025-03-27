package com.java;
/*Write java c program to check whether triangle is valid or not. using ternary oprator*/
import java.util.*;
public class TriangleValidOrNot
{
	public static void main(String x[])
	{
		int side1,side2,side3;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the triangle 3 side");
		side1 = scan.nextInt();
		side2 = scan.nextInt();
		side3 = scan.nextInt();
		result = (side1 + side2 > side3 || side2 + side3 > side1 || side3 + side1 > side2)?"Volid":"Not valid";
		System.out.println(result);
	}
}
