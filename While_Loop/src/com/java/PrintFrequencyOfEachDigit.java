package com.java;
/* 8. Write a Java program to find frequency of each digit in a given integer.
 input : 1232341
  output : 1 ---->2  
          2 ---->2
          3 ---->2
          4 ---->1 */

import java.util.*;

public class  PrintFrequencyOfEachDigit
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		int i = 0;
		
		int rem ;

		while(i <= 9)
		{
			int temp = num;
			int count = 0;
			while(temp !=0)
			{
				rem = temp % 10;
				if(rem == i)
				{
					count++;
				}
				temp = temp / 10;
			}
			if(count > 0)
			{
				System.out.println(i + "---------->" + count);
			}	
			i++;
		}
	}
}