package com.java;
/* 20. Write a java program to print all ASCII character with their values. */

public class PrintAllASCIIcharacter
{
	public static void main(String[] args) 
	{
        	int i = 0;

        	while (i < 256) 
		{
            		char ch = (char) i;

            		if (ch >= 32 && ch <= 126) 
			{ 
                		System.out.println("ASCII value of " + ch + " is " + i);
            		}
           		 i++;
		}
	}
}
