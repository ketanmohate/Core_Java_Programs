package Loopng_PDF;

/* 21. Write a C program to find power of a number using for loop.*/

import java.util.*;

public class Q21_Find_Power_Of_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Base:");
		int Base = sc.nextInt();
		
		System.out.println("Enter the Indext(Exponent):");
		int index = sc.nextInt();
		
		int pow = 1;
		for(int i = 1 ; i <= index ; i++)
		{
			pow = pow * Base;
		}
		System.out.println("Power is : " + pow);
		
	}

}
