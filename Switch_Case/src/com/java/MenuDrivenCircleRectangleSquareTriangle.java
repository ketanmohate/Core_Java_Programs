package com.java;
/* Q.4 Write a menu driven program for following

'c': Area of circle

'r': Area of rectangle

's': Area of square

't': Area of triangle */

import java.util.*;
public class MenuDrivenCircleRectangleSquareTriangle
{
	public static void main(String args[])
	{
		char choise;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you are choise:");
		System.out.println("'c': Area of circle");
		System.out.println("'r': Area of rectangle");
		System.out.println("'s': Area of square");
		System.out.println("'t': Area of triangle");
		
		choise = scan.nextLine().charAt(0);
		double area ,side ,redius, pi=3.14, base ,height, lenght ;	

		switch (choise)
		{
			case 'c':
				System.out.println("Enter the redius:");
				redius = scan.nextDouble();
				area = redius*redius*pi;
				System.out.println("The area of circle:" + area);
				break;
				
			case 'r':
				System.out.println("Enter the height:");
				height = scan.nextInt();
				System.out.println("Enter the lenght:");
				lenght = scan.nextInt();
				area = (height * lenght);
				System.out.println("The area of Rectangle:" + area);
				break;	

			case 's':
				System.out.println("Enter the side:");
				side = scan.nextInt();
				area = side * side;
				System.out.println("The area of Square:" + area);
				break;

			case 't':
				System.out.println("Enter the sidde:");
				side = scan.nextDouble();
				System.out.println("Enter the Base:");
				base = scan.nextDouble();
				area = (side*base)/2;	
				System.out.println("The area of Tringle:" + area);
				break;

			default:
				System.out.println("Invalid");
		}
	}
}