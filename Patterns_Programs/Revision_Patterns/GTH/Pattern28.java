package GTH;

public class Pattern28 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=10 ; j++)
			{
				if(j<=5 && j<=i)
				{
					System.out.print("* ");
				}
				else if(j>5 && j>=11-i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=10 ; j++)
			{
				if(j<=5 && j<=6-i)
				{
					System.out.print("* ");
				}
				else if(j>5 && j>=5+i)
				{
					System.out.print("* ");
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
