package com.java;

/*
Write a Java program to enter radlus of a circle and find Its diameter, circumference and area.
Formula:
dlameter=2* rad;
circumference = 2*pl*rad;
area=pl*rad*rad;
*/
import java.util.*;
public class AreaDiameterCircumference
{
	public static void main (String args[])
	{
		int radius;
		double PI=3.14,area,circum,diameter;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = scan.nextInt();
		diameter = 2*radius;
		System.out.println("the diameter:"+diameter);
		circum = 2*PI*radius;
		System.out.println("the circumeference is:"+circum);
		area = PI*radius*radius;
		System.out.println("the area of: "+area);
	}
}
