package com.java;
/*Q.1. write a java program to display a weekday as per given number (1.Monday, 2.Tuesday, 3.Wednesday, 4.Thursday, 5.Friday, 6.Saturday, 7.Sunday.)*/

import java.util.*;
public class WeekdayApp
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		switch (num)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");		
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid");
		}
	}
}
		