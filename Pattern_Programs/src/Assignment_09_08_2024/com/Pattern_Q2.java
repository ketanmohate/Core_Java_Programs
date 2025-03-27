package Assignment_09_08_2024.com;

/* 
Pattern
 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 

End
*/

public class Pattern_Q2 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			int flag=0;
			
			for(int j = 1 ; j <= 5 ; j++)
			{
				if(i%2 != 0)
				{
					if(flag==0)
					{
						System.out.print(0 + " ");
						flag=1;
					}
					else if(flag==1) 
					{
						System.out.print(1 + " ");
						flag=0;
					}
				}
				if(i%2 == 0)
				{
					if(flag==0)
					{
						System.out.print(1 + " ");
						flag=1;
					}
					else if(flag==1) 
					{
						System.out.print(0 + " ");
						flag=0;
					}
				}
			}
			
			System.out.println("");
		}

	}

}
