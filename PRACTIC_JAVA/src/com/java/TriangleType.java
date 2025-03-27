package com.java;
/*Write a c program to check whether triangle is equilateral , isoscale  or scalene.*/
import java.util.Scanner;

public class TriangleType {
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter the lengths of the sides of the triangle:");
        	System.out.print("Side 1: ");
        	double side1 = scanner.nextDouble();
        	System.out.print("Side 2: ");
        	double side2 = scanner.nextDouble();
        	System.out.print("Side 3: ");
        	double side3 = scanner.nextDouble();
        	String type = (side1 == side2 && side2 == side3)?"Equilateral":(side1 == side2 || side2 == side3 || side1 == side3) ? "Isosceles" : "Scalene";
        	System.out.println("The triangle is " + type);
	}
}
