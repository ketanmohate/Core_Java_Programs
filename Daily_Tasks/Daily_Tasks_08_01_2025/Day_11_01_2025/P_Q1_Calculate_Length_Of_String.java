package Day_11_01_2025;

/*
 * Q1. WAP to calculate the length of a string without using the length() method?
 */

import java.util.*;

public class P_Q1_Calculate_Length_Of_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		int count=0;
		
		for(char s : str.toCharArray())
		{
			count++;
		}
		
		System.out.println("Length:-\t"+count);
	}

}
