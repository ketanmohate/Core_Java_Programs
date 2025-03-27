package Looping.programs;

/*21.	Write a C program to find power of a number using for loop.*/

import java.util.*;

public class Q21_Find_Power_Of_A_Number {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base");
		int base = sc.nextInt();
		
		System.out.println("Enter the exponent");
		int exponent = sc.nextInt();
		
		int power=1;
		
		for(int i=1 ; i<= exponent ; i++)
		{
			power = power * base;
		}
		
		System.out.println("Power is:\t" + power);
	}
}
