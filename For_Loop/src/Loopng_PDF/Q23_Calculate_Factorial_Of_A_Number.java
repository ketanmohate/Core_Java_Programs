package Loopng_PDF;

/* 23. Write a C program to calculate factorial of a number. */

import java.util.*;

public class Q23_Calculate_Factorial_Of_A_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		long num = sc.nextInt();
		
		// main logic
		System.out.println("Factorial of Given Number");
		long fact=1;
		for(long i = 1 ; i <= num ;i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
		
	}

}
