package com.java;
/* 3. Write a java program to print all alphabets from a to z.*/



public class AlphabetAtoZApp
{
	public static void main(String args[])
	{
		char ch = 'a';
		
		while(ch <= 'z')
		{
			System.out.println(ch);
			ch++;
		}
	}
}