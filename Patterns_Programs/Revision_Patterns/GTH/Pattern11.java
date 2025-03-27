package GTH;

public class Pattern11 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(i==5 || j==1 || j==i)
				{
					System.out.print(j + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}
}
