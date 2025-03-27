package com.java;

/* Q. WAP to create class name as Factorial  with two functions 
void setValue(int no): this function can accept number as parameter
void calFactorial(): this function can calculate  factorial of number and display it.
*/

import java.util.*;

class calFactorical
{
	Scanner sc = new Scanner(System.in);
	int num;
	
	void setVal()
	{
		System.out.println("Enetr the number");
		num=sc.nextInt();
	}
	
	void calFactorial()
	{
		int fact = 1;
		for(int i = 1 ; i<= num ; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of given number:"+fact);
	}
}

public class OOps5_CalFactorial 
{
	public static void main(String args[])
	{
		calFactorical obj = new calFactorical();
		obj.setVal();
		obj.calFactorial();
	}
}
