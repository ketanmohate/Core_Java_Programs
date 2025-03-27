package Day_13_01_2025;

/*
 Q1. Java program to print Even length words in a String?

Input: s = "This is a java language"

Output: This is  java language

Explanation: All the elements with the length even are printed. 
                        "This" length is 4 so printed whereas "a" length is 1 so not Printed. 

 */

import java.util.*;

public class Q1_Print_Even_Length_Words_In_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		String s[] = str.split(" ");
		
//		for(int i=0 ; i<s.length ;i++)
		for (String word : s)
		{
			if(word.length() % 2==0)
			{
//				System.out.print(s[i]+" ");
				System.out.print(word + " ");
				
			}
		}
	}

}
