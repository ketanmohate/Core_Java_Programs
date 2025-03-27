package Looping.programs;

/*28.	Write a C program to find sum of all prime numbers between 1 to n.*/

import java.util.Scanner;

public class Q28_Find_Sum_Of_All_Prime_Numbers {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit :");
		int limit = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i<=limit ; i++)
		{
			int count = 0;
			
			for(int j=1; j<=i ; j++)
			{
				if(i%j == 0) 
				{
					count++;
				}
			}
			if(count == 2)
			{
				sum = sum +i;
			}
		}
		System.out.println("Sum Is:\t " + sum);
	}
}
