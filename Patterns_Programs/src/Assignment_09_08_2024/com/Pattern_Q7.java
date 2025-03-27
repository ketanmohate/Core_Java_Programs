package Assignment_09_08_2024.com;

/* 
Pattern
 
 *           *   
 *           *   
 *           *   
 *           *   
 *  *  *  *  *

End
*/

public class Pattern_Q7 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			for(int j = 1 ; j <= 5 ; j++)
			{
				if(j==1 || i==5 || j==5)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println("  ");
		}

	}
}
