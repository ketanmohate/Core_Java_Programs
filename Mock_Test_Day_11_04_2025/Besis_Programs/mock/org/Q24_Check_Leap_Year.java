package mock.org;

/*
 * 24. Check Leap Year
Description: Write a program to check if a given year is a leap year.
Input: year = 2020
Output: Leap Year
 */

import java.util.*;

public class Q24_Check_Leap_Year {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		
		if(year%4 == 0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}

}
