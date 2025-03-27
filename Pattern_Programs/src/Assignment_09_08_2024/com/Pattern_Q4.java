package Assignment_09_08_2024.com;

/* 
Pattern
 
0         
1 1       
0 0 0     
1 1 1 1   
0 0 0 0 0 

End
*/

public class Pattern_Q4 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i <=5 ; i++)
		{
			for(int j = 1 ; j <=5 ; j++)
			{
				if(i>=j)
				{
					if(i%2 != 0)
					{
						System.out.print("0 ");
					}
					else
					{
						System.out.print("1 ");
					}
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
