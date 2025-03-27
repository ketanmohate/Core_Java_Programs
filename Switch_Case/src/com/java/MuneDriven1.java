package com.java;
/* Write a java menu driven program for following:
	1. Area of Circle
	2. Area of Tringle
	3. Area of Rectangle
	4. Area of Square */

import java.util.*;
public class MuneDriven1
{
	public static void main(String args[])
	{
		int choise;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you are choise");
		System.out.println("1. Area of Circle");
		System.out.println("2. Area of Tringle");
		System.out.println("3. Area of Rectangle");
		System.out.println("4. Area of Square");
		
		choise = scan.nextInt();
		double area ,side ,redius, pi=3.14, base ,height, lenght ;

		switch (choise)
		{	
			case 1:
				System.out.println("Enter the redius:");
				redius = scan.nextDouble();
				area = redius*redius*pi;
				System.out.println("The area of circle:" + area);
				break;
				
			case 2:
				System.out.println("Enter the sidde:");
				side = scan.nextDouble();
				System.out.println("Enter the Base:");
				base = scan.nextDouble();
				area = (side*base)/2;	
				System.out.println("The area of Tringle:" + area);
				break;	

			case 3:
				System.out.println("Enter the height:");
				height = scan.nextInt();
				System.out.println("Enter the lenght:");
				lenght = scan.nextInt();
				area = (height * lenght);
				System.out.println("The area of Rectangle:" + area);
				break;

			case 4:
				System.out.println("Enter the side:");
				side = scan.nextInt();
				area = side * side;
				System.out.println("The area of Square:" + area);
				break;

			default:
				System.out.println("Invalid");
		}
	}
}



