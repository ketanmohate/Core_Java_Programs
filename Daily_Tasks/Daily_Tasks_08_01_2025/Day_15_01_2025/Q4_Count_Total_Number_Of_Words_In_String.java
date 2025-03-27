package Day_15_01_2025;

/*
 * Q4.Write a program in C to count the total number of words in a string.
 */

import java.util.*;

public class Q4_Count_Total_Number_Of_Words_In_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		String[] s = str.split(" ");
		
		System.out.println("Total number of words:-\t "+ s.length);
	}

}

