package com.java;
/* Write a java program to swap first and last digits of a number. */
	
import java.util.*;
	
public class SwapFirstAndLastDigit
{
	public static void main(String args[])
	{
		int  num,temp = 0,x,count = 0,firstdigit,lastdigit,i,mid;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		temp = num;		

		while(temp >0)
		{
			temp = temp / 10;
			count ++;
		}

		System.out.println(count);

		i = 1;
		x = 1;
		
		while(i<count)
		{
			x = x * 10;
			i++;
		}		
		
		System.out.println(x);	
		firstdigit = num / x ;
		lastdigit = num % 10;
		mid = (num % x) / 10;
		
		System.out.println(firstdigit);
		System.out.println(mid);
		System.out.println(lastdigit);
		
		System.out.println("after swap:");
		
		num = lastdigit * x + mid * 10 + firstdigit;
		System.out.println(num);
		
	}
}
		