package Loopng_PDF;

/* 32. Write a C program to check whether a number is Perfect number or not.*/

import java.util.*;

public class Q32_Check_Number_is_Perfect_Or_Not 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		// main logic
		int sum=0;
		for(int i=1; i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("Number is Perfect");
		}
		else
		{
			System.out.println("Number is Not Perfect");
		}
		
	}

}
