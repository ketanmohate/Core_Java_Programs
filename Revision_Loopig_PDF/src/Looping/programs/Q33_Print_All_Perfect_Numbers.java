package Looping.programs;

/*33.	Write a C program to print all Perfect numbers between 1 to n.*/

import java.util.*;

public class Q33_Print_All_Perfect_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		
		for(int num=1; num<=limit ; num++)
		{
			int sum = 0 ;
			
			for(int i=1; i<=num/2 ; i++)
			{
				if(num%i == 0)
				{
					sum = sum + i;
				}
			}
			if(sum == num && num > 0)
			{
				System.out.println(num);
			}
		}
	}
}
