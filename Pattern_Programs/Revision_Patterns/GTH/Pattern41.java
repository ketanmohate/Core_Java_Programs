package GTH;

public class Pattern41 
{
	public static void main(String[] args) 
	{	
		for(int i=1 ; i<=5 ; i++)
		{
			int ch=64 + i;
			int chh=65;
			
			for(int j=1 ; j<=9 ; j++)
			{
				if(j<=i)
				{
					System.out.printf("%c ",ch--);
				}
				else if(j<=i*2-1)
				{
					System.out.printf("%c ",++chh);
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
