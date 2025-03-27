package com.java;

/* Q. WAP to create class name as Perfect with two functions 
void setNum(int no): this function accept number as parameter 
void calPer(): this method can check number is perfect or not 
*/

import java.util.*;

class PerfectOrNot
{
	int num; 
	
	void setNum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter the number");
		num = sc.nextInt();
	}
	
	void calPer()
	{
		int sum=0;
		for(int i = 1 ; i<=num/2 ; i++)
		{
			if(num%i == 0)
			{
				sum = sum + i;
			}
		}
		
		if(num == sum && num >0)
		{
			System.out.println("Number is Perfect");
		}
		else
		{
			System.out.println("Number is Not Perfect");
		}
	}
}

public class OOps4_NumPerfectOrNot 
{
	public static void main(String args[])
	{
		PerfectOrNot obj = new PerfectOrNot();
		obj.setNum();
		obj.calPer();
	}
}
