package com.java;

/* Q. WAP to create class name as Power with two functions 
void setValue(int base,int index): this method can accept base and index value
void calPower(): this method can calculate power of number and display it.
*/

import java.util.*;

class CalPower
{
	int base;
	int index;
	
	Scanner sc = new Scanner(System.in);
	
	public void setValue()
	{
		System.out.println("Enter the base:");
		base = sc.nextInt();
		
		System.out.println("Enter the index:");
		index = sc.nextInt();
	}
	
	public void calPower()
	{	
		int power=1;
		for(int i = 1 ; i <= index ; i++)
		{
			power  = power * base;
		}
		
		System.out.println("power of:" + power);
	}
}

public class OOps3_CalPower 
{
	public static void main(String args[])	
	{
		CalPower obj = new CalPower();
		obj.setValue();
		obj.calPower();
	}

}
