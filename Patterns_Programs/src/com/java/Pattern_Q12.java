package com.java;

/* 
 pattern 
 
        1
      2 3 2 
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5

end
 */

public class Pattern_Q12
{
	public static void main(String[] args)
	{		
		for(int i = 0 ; i < 5 ; i++)
		{	
			int count = (1 + i); 
			
			int count2 = (2 * i); // main logic
			
			for(int j = 0 ; j<= 9 ; j++)
			{
				if(j<=5 && j>=5-i)
				{
					System.out.print(count + " ");
					count++;
					
				}
				else if(j>=6 && j<=5+i)
				{
					System.out.print(count2+" ");
					count2--;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
