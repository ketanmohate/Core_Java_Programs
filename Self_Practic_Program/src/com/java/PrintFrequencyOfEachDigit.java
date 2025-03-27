package com.java;
/* 8. Write a Java program to find frequency of each digit in a given integer.
 input : 1232341
  output : 1 ---->2  
          2 ---->2
          3 ---->2
          4 ---->1 */



/* 		if(rem == 1) // true
		{
			j++; // 1 
		}
*/

import java.util.*;

public class  PrintFrequencyOfEachDigit
{
	public static void main(String args[])
	{
		int num;   // 1231
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		int i = 0;
		int j = 0;	
		int rem = 0;
		int m = 0;
		
		while(num > i)
		{
			rem = num % 10;
			while(rem > m)
			{
				if(rem == m)
				{
					j++;
				}	
			}
			m++;
			num = num / 10;
		}
		System.out.println(j);
	}
}

		
	