package com.java;
/*Q.5. Write a java program to check whether a number is positive , negative or zero using switch statements*/

import java.util.Scanner;

public class PositiveNegativeCheckSwitch 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();	

		switch (Integer.signum(number)) 
		{		
			case 1:
        			System.out.println("The number is positive.");
        			break;

      		case -1:
        			System.out.println("The number is negative.");
        			break;

      		case 0:
        			System.out.println("The number is zero.");
        			break;
    	}
  	}
}
