package com.java;

/* Q12.Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
PerHeight < 150.0  : The person is Dwarf.
PerHeight >= 150.0 && PerHeight < 165.0  :   The person is  average heighted. 
PerHeight >= 165.0 && PerHeight <= 195.0 :  The person is taller.
Test Data : 135
Expected Output :
The person is Dwarf. */

import java.util.*;
public class PersonHieghtCategorize
{
	public static void main(String args[])
	{
		double height;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height of person in centimeter:");
		height = scan.nextDouble();
		if(height < 150.0)
		{
			System.out.println("The person is Dwarf");
		}
		else if(height >= 150.0 && height < 165.0)
		{
			System.out.println("The person is  average heighted");
		}
		else if(height >= 165.0 && height <= 195.0)
		{
			System.out.println("The person is taller");
		}
		else
		{
			System.out.println("Enter the valid height(<=195.0)");
		}
	}
}
