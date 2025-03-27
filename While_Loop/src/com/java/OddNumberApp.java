package com.java;
/* 5. Write a java program to print all odd number between 1 to 100.*/

public class OddNumberApp
{
	public static void main(String args[])
	{
		int i = 1;
		
		while(i <=100)
		{
			if(i % 2 == 1)
			{
				System.out.println(i);
			}
		i++;
		}
	}
}
