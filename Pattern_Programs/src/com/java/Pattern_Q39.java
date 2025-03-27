package com.java;

/* 
Pattern
 
A          
B C        
D E F      
G H I J    
K L M N O  

End
*/

public class Pattern_Q39
{
	public static void main(String[] args) 
	{	
		char ch='A';
		
		for(int i = 1 ; i<=5 ; i++)
		{	
			for(int j = 1 ; j<=5 ; j++)
			{
				if(i>=j)
				{
					System.out.print(ch + " ");
					ch++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
}