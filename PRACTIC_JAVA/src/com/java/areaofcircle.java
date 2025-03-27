package com.java;
import java.util.*;
public class areaofcircle {
	public static void main(String args[])
	{
		int redius;
		double area;
		double PI=3.14;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the redius:");
		redius = scan.nextInt();
		area=PI*redius*redius;
		System.out.println("The area of circle is:"+area);
	}
}
