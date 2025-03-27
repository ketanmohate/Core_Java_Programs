package com.java;

/* 
Pattern
 
   **** 
  ****  
 ****   
****

End
*/

public class Pattern_Q33 
{
	public static void main(String[] args) 
	{
//		for(int i = 1 ; i<=4 ; i++)
//		{
//			for(int j = 1 ; j<=7 ; j++)
//			{
//				if((i==1 && j>=4 && j<=7) || (i==2 && j>=3 && j<=6) || (i==3 && j>=2 && j<=5) || (i==4 && j>=1 && j<=4))
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println(" ");
//		}

		for(int i = 1 ; i<=4 ; i++)
		{
			for(int j = 1 ; j<=7 ; j++)
			{
				if(j<=3 && j<=4-i || j>=5 && j>=9-i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
}
