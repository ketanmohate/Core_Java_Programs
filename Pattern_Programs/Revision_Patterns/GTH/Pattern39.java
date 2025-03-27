package GTH;

public class Pattern39 
{
	public static void main(String[] args) 
	{
		int ch=65;
		
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(j<=i)
				{
					System.out.printf("%c ",ch++);
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
