package com.java;
/*Q.5. Write a java program to check whether a number is positive , negative or zero using switch statements*/

import java.util.*;
public class SwitchPositiveNagative
{
	public static void main(String args[])
	{
		int choise,num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		switch (num)
		{
			case 0:
				System.out.println("The number is zero.");
				break;
			default:
				if(num > 1)
				{
					System.out.println("Number is positive");
				}
				else
				{
					System.out.println("Number is nagative");
				}
		}
	}
}
