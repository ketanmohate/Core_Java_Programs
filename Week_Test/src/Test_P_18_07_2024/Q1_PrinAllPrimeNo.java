package Test_P_18_07_2024;

/* Q1. WAP to print the all-prime numbers 1 to 100? */

import java.util.*;

public class Q1_PrinAllPrimeNo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the N number");
		int num = sc.nextInt();
		
		System.out.println("Prime Numbers : ");
		
		for(int i = 2 ; i <= num ; i++)
		{
			int  flag=1;
			
			for(int j = 2 ; j<= i/2 ; j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.print(i + "\t");
			}
		}
		
	}

}
