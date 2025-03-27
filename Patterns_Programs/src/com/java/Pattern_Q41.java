package com.java;

/* 
Pattern
 
A 
B A B 
C B A B C 
D C B A B C D 
E D C B A B C D E

End
*/

public class Pattern_Q41
{
	public static void main(String[] args) 
	{			
		for(int i = 1 ; i <= 5 ; i++)
		{
			int ch = (64 + i);
			int chh = 66;
			
			for(int j = 1 ; j < i*2 ; j++)
			{
				if(i>=j)
				{
					System.out.printf("%c " , ch);
					ch--;
				}
				else
				{
					System.out.printf("%c " , chh);
					chh++;
				}
			}
			System.out.println("");
		}
	}
}