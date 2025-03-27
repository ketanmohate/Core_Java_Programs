package Assignment_09_08_2024.com;

/* 
Pattern
 
*     
* *   
* * * 
*     
* *   
* * *

End
*/

public class Pattern_Q6 
{
	public static void main(String[] args) 
	{	
		for(int i = 1 ; i <=6 ; i++)
		{
			for(int j = 1 ; j <=3 ; j++)
			{
				if(i<= 3 && i>=j)
				{
					System.out.print("* ");
				}
				else if(i>=4 && j<=i-3)
				{
					System.out.print("* ");
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
