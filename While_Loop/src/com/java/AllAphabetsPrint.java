package com.java;
/* 3. Write a Java program to print all alphabets from a to z.*/
	
public class AllAphabetsPrint
{
	public static void main(String args[])
	{
		char ch = 'a';
		
		System.out.println("lowercase alphabets:");		

		while(ch <= 'z')
		{
			System.out.println(ch);
			ch++;
		}
		
		System.out.println(" uppercase alphabets:");	
		
		char chh = 'A';
		
		while(chh <= 'Z')
		{
			System.out.println(chh);
			chh++;
		} 
		
		System.out.println("lowercase alphabets using ascii value:");		
		
		int i = 97;
		
		while(i <= 122)
		{
			System.out.printf("%c\n",i);
			i++;
		}

		
		System.out.println("uppercase alphabets using ascii value:");	
		
		int j = 65;
		
		while(j <= 90)
		{
			System.out.printf("%c\n",j);
			j++;
		}
	}
}
		