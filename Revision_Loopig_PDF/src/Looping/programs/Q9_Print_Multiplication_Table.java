package Looping.programs;

/*
 * 9.	Write a C program to print multiplication table of any number.
 */

import java.util.*;

public class Q9_Print_Multiplication_Table {
	public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the N	umber to print teble");
		int n = sc.nextInt();
		
		System.out.println("Multiplication Table");
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
}
