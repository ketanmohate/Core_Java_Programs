package GTH;

public class Pattern43 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ;j<2*i ; j++)
			{
				if(j<=i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			for(int j=2*i ;j<1 ; j++)
			{
				if(j<=i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
