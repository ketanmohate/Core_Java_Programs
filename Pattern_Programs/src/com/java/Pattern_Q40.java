package com.java;

/* 
Pattern
 
ABCDEDCBA
ABCD DCBA
ABC   CBA
AB     BA
A       A

End
*/

public class Pattern_Q40
{
	public static void main(String[] args) 
	{			
		for(int i = 1 ; i<=5 ; i++)
		{	
			int ch=64;
			int c=68;
			
			for(int j = 1 ; j<=9 ; j++)
			{	
				if(j<=6-i && j<=5)
				{
					System.out.printf("%c" , ++ch);
				}
				else if(j>=4+i && j>5 && i>=2)
				{
					System.out.printf("%c" , ch--);
				}
				else if(i== 1 && j>=5+i && j>5)
				{
					System.out.printf("%c" , c--);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}