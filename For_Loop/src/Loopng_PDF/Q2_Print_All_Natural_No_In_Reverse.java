package Loopng_PDF;

/* 2. Write a C program to print all natural numbers in reverse (from n to 1). - using while loop */

import java.util.*;

public class Q2_Print_All_Natural_No_In_Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the N value(Limit):");
		int n = sc.nextInt();
		
		System.out.println("Print All Natural Number In Reverse");
		for(int i = n ; i >= 1 ; i--)
		{
			System.out.println(i);
		}

	}

}
