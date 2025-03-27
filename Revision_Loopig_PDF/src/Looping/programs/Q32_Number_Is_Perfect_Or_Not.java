package Looping.programs;

/*32.	Write a C program to check whether a number is Perfect number or not.*/

import java.util.*;
	public class Q32_Number_Is_Perfect_Or_Not {
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Number");
			int num = sc.nextInt();
			
			int sum = 0;
			
			for(int i=1 ; i<=num/2 ; i++)
			{
				if(num%i == 0)
				{
					sum = sum + i;
				}
			}
			
			if(sum == num && num > 0)
			{
				System.out.println("Number is Perfect");
			}
			else
			{
				System.out.println("Number id Not Parfect");
			}
		}
	}
