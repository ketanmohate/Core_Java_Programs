package Loopng_PDF;

/* 26. Write a C program to check whether a number is Prime number or not.*/

import java.util.*;

public class Q26_Check_Number_Is_Prime_Or_Not 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		// main logic
		int count=0;
		
		for(int i = 1 ; i <= num ; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Number Is Prime");
		}
		else
		{
			System.out.println("Number Is Not Prime");
		}
	}

}
