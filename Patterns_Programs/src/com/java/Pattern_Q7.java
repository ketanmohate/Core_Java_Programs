package com.java;

/* 
Pattern 

 *     *     *     *     *     * 
    *     *     *     *     *    
       *     *     *     *       
          *     *     *          
             *     *             
                *                

End
*/

public class Pattern_Q7 
{
	public static void main(String[] args) 
	{
		int flag =0;
		
		for(int i = 1 ; i <= 6 ; i++)
		{
			for(int j = 1 ; j <= 11 ; j++)
			{
				if((j<=6 && i<=j && flag==0) || (j>=7 && j<=12-i & flag==0))
				{
					System.out.print(" * ");
					flag=1;
				}
				else
				{
					System.out.print("   ");
					flag=0;
				}
			}	
			System.out.println("");
		}
	}

}
