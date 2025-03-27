package Loopng_PDF;

/* 20. Write a C program to print all ASCII character with their values. */

import java.util.*;

public class Q20_Print_All_ASCII_Character 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of Start");
		int start = sc.nextInt();
		
		System.out.println("Enter the value of End(limit-255)");
		int end = sc.nextInt();
		
		System.out.println("Print ASCII Character");
		for(int i = start ; i <= end ; i++)
		{
			System.out.printf("%c \t",i);
		}
	}

}
