package com.java;

import javax.swing.plaf.synth.SynthSliderUI;

/* 
Pattern
 
A  
A B A  
A B C B A  
A B C D C B A  
A B C D E D C B A 

End
*/

public class Pattern_Q42
{
	public static void main(String[] args) 
	{			
		for(int i = 1 ; i<=5 ; i++)
		{	
			int ch=65;
			int chh=(63 + i);
			
			for(int j = 1 ; j< 2*i  ; j++)
			{
				if(j<=i)
				{
					System.out.printf("%c ", ch);
					ch++;
				}
				else 
				{
					System.out.printf("%c " , chh);
					chh--;// Print decreasing part
				}
			}
			System.out.println(" ");
		}
	}
}