package com.java;

/* 
Pattern
 
        1         
      1   2       
    1       3     
  1           4   
1   2   3   4   5  

End
*/

public class Pattern_Q13 
{
	public static void main(String[] args)
	{		
		int count2=1;
		int count3=1;
		
		for(int i = 1 ; i <= 5 ; i++)
		{	
			int count=1;
			int flag=0;
			
			for(int j = 1 ; j<=9 ; j++)
			{
				if( i<=4 && j<=5 && j==6-i)
				{
					System.out.print(count + " ");
				}
				else if(i==5 && flag==0)
				{
					System.out.print(count2 + " ");
					count2++;
					flag=1;
				}
				else if(j==4+i)
				{
					System.out.print(++count3 + " ");
				}
				else
				{
					System.out.print("  ");
					flag=0;
				}
			}
			System.out.println("");
		}
	}
}
