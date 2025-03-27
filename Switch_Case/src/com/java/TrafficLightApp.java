package com.java;
/* Q.3. Write a java program to demonstrate Traffic light signals: use switch case :-
R = Red- Stop the vehicle.
G = Green - You Can Go.
Y = Yellow - Ready to Go. 
W- White - automated cars are dictating the Traffic flow. */

import java.util.*;
	
public class TrafficLightApp
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter you are choise:");
		System.out.println("R = Red");
		System.out.println("G = Green");
		System.out.println("Y = Yellow");
		System.out.println("W- White");

		char choise = scan.nextLine().charAt(0);
		
		switch (choise)
		{
			case 'R':
				System.out.println("Stop the Vehicle");
				break;
			case 'G':
				System.out.println("You can GO");
				break;
			case 'Y':
				System.out.println("Ready to Go");
				break;
			case 'W':
				System.out.println("Automated cars are dictating the Traffic flow");
				break;
			default:
				System.out.println("Invalid");
		}
	}
}