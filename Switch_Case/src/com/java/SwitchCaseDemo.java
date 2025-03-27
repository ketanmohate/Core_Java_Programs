package com.java;
/* Write a java program to to demo switch case.(Using Switch case)*/
	
import java.util.*;
public class SwitchCaseDemo
{
	public static void main(String agrs[])	
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		num = scan.nextInt();
		
		switch (num)
		{
			case 1:
			
					System.out.println("Hello");
					break;
			
			case 2:
			
					System.out.println("Ketan");
					break;
			
			case 3:
			
					System.out.println("Mohate");
					break;	
			
			default:
			
					System.out.println("invalid");
		}
	}
}
		
	