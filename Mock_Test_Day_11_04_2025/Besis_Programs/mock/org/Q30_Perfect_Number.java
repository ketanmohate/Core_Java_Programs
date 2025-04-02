package mock.org;

/*
30. Perfect Number
Description: Write a program to check if a number is perfect.
Input: n = 6
Output: Perfect
 */

import java.util.*;

public class Q30_Perfect_Number{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1 ; i<n ; i++)
		{
			if(n%i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == n)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Not Perfect");
		}
	}
}
