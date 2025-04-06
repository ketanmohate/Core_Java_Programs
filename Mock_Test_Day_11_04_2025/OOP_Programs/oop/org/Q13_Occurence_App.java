package oop.org;

/*
 * 	
Q13. Write a java program to create class name as OccurenceApp using contsructor name as :

	OccurenceApp(int [ ])
	{
		//  count even and odd number in array.
	}
	
	OccurenceApp(char [ ])
	{
		//  count vowel and consonent charcter in string.
	}
 */

import java.util.*;

class OccurenceApp
{
	OccurenceApp(int[] arr)
	{
		int countOdd = 0;
		int countEven = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2 == 0)
			{
				countEven++;
			}
			else
			{
				countOdd++;
			}
		}

		System.out.println("Number of Odd Numbers:\t " + countOdd);
		System.out.println("Number of Even Numbers:\t" + countEven);
	}
	
	OccurenceApp(char[] chArr)
	{
		int vowels = 0;
		int consonent = 0;
		
		for (int i = 0; i < chArr.length; i++) 
		{
			char ch = chArr[i];
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
			{
				vowels ++;
			}
			else
			{
				consonent++;
			}
		}

		System.out.println("Number of vowels:\t " + vowels);
		System.out.println("Number of consonent:\t" + consonent);
	}

}

public class Q13_Occurence_App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the value");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.nextLine();
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		OccurenceApp Occapp = new OccurenceApp(arr);
		 Occapp = new OccurenceApp(ch);
		
	}

}
