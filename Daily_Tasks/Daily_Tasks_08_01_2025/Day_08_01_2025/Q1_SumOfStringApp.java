package Day_08_01_2025;

import java.util.Scanner;

public class Q1_SumOfStringApp 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		int sum=0;
		
		/*
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				sum = sum + Character.getNumericValue(ch);;
			}
		}
		System.out.println("Sum is:-"+sum); 
		*/
		
		char ch[] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>= 48 && ch[i]<=57)
			{
				sum = sum + ch[i]-48;
			}
		}
		System.out.println("Sum is:-"+sum); 
	}
}
