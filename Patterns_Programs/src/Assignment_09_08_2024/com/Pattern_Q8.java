package Assignment_09_08_2024.com;

/* 
Pattern
 
0 0 1 1 1   
0 0 1 1 1   
0 0 1 1 1   
0 0 1 1 1   
0 0 1 1 1 

End
*/

public class Pattern_Q8 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			for(int j = 1 ; j <= 5 ; j++)
			{
				if(j<=2)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}
			}
			System.out.println("  ");
		}

	}
}
