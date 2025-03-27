package Looping.programs;

/*
 * 5. Write a C program to print all odd number between 1 to 100.
 */

import java.util.*;

public class Q5_Print_Odd_Numbers {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		System.out.println("Odd Numbers");
		for(int i=1 ; i<=n ; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
			}
		}
	}
}
