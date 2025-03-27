package com.java;

/* Q1. WAP to create class name as SwapDigit with two functions
void setValue(int no): this function can accept number as parameter 
int getNumAfterSwap(): this function can swap first and last digit of number and return it.
 */

class SwapDigit
{
	int num;
	
	void setValue(int x)
	{
		num=x;
	}
	
	void getNumAfterSwap()
	{
		int count = 0;
		
		int temp = num;		

		while(temp >0)
		{
			temp = temp / 10;
			count ++;
		}

		int i = 1;
		int x = 1;
		
		while(i<count)
		{
			x = x * 10;
			i++;
		}		
		
		int firstdigit = num / x ;
		int lastdigit = num % 10;
		int mid = (num % x) / 10;
		
		num = lastdigit * x + mid * 10 + firstdigit;

		System.out.println("After swap:");
		System.out.println(num);
	}
}

public class OOps6_SwapFirstandLast 
{
	public static void main(String[] args) 
	{
		SwapDigit obj = new SwapDigit();
		obj.setValue(1234);
		obj.getNumAfterSwap();
	}

}
