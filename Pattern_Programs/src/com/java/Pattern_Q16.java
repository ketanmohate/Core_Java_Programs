package com.java;

/* 
Pattern
 
 A                         
 A  B  A                   
 A  B  C  B  A             
 A  B  C  D  C  B  A       
 A  B  C  D  E  D  C  B  A

End
*/

public class Pattern_Q16 
{
	public static void main(String[] args)
	{	
		int ch =64;
		
		for(int i = 1 ; i <= 5 ; i++)
		{	
			int chh = 63;
			chh = chh + i;
			
			for(int j = 1 ; j<=9 ; j++)
			{
				if(j<=i)
				{
					System.out.printf(" %c ",ch+j);
				}
				
				else if(j< i*2)
				{
					System.out.printf(" %c ",chh);
					chh--;
				}
//				else
//				{
//					System.out.print("   ");
//				}
			}
			System.out.println("");
		}
	}
}
