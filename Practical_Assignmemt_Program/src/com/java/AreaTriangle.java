package com.java;
/*Write a java program to enter base and height of a triangle and find its area.*/
import java.util.*;
public class AreaTriangle
{
	public static void main(String x[])
	{
		float base,height,area;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base :");
		base = scan.nextInt();
		System.out.println("Enter the height :");
		height = scan.nextInt();
		area = (base * height) / 2;
		System.out.println("The area of the triangle is: " + area);
	}
}