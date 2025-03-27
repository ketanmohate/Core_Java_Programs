package com.java;

/* 
Pattern
 
        1         
      1 2 1       
    1 2 3 2 1     
  1 2 3 4 3 2 1   
1 2 3 4 5 4 3 2 1        

End
*/

public class Pattern_Q17 
{
	public static void main(String[] args)
	{		

		int count2=4;
		
		for(int i = 1 ; i <= 5 ; i++)
		{	
			int count1=1;
			for(int j = 1 ; j<=9 ; j++)
			{
				if(j<=5 && j>=6-i)
				{
					System.out.print(count1 + " ");
					count1++;
				}

				else if((j>=6 && i == 5))
				{
					System.out.print(count2 + " ");
					count2--;
				}
				else if((i>=2 && i<=4 && j>=5 && j==3+i ))
				{
					int count=2;
					System.out.print(count + " ");
				}
				else if((i>=2 && i<=4 && j>=5 && j==4+i ))
				{
					int count=1;
					System.out.print(count + " ");
				}
				else if((i>=2 && i<=4 && j>=5 && j==2+i ))
				{
					int count=3;
					System.out.print(count + " ");
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
