package com.java;

/*Write a java program to calculate area of an equilateral triangle using */
import java.util.*;
public class EquilateralTringleArea
{
	public static void main (String x[])
	{
		double side,area;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter side1:");
		side = scan.nextDouble();
		area =(1.73*side*side)/4 ;
		System.out.println(area);
	}
} 