package GTH;

public class Pattern16 
{
	public static void main(String[] args) 
	{
		int chh=64;
		for(int i=1 ; i<=5 ; i++)
		{
			int ch=65;
			
			for(int j=1 ; j<=9 ; j++)
			{
				if(j<=i)
				{ 
					System.out.printf("%c ",ch);
					ch++;
				}
				else if(j<=i*2-1)
				{
					System.out.printf("%c ",chh);
					chh--;
				}
				else
				{
					System.out.print("   ");
				}
			}
			chh=chh+i;
			System.out.println();
		}
	}

}
