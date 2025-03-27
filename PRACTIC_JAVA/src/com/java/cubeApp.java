package com.java;
import java.util.*;

public class cubeApp {
	public static void main(String args[])
	{
		double sideLength,cal;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		sideLength = scan.nextDouble();
		cal = 6*sideLength*sideLength;
		System.out.println("The area of cube"+cal);
	}

}
