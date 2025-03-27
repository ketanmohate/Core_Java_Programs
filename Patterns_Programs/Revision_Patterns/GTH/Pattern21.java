package GTH;

public class Pattern21 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(i<=5 && j<=i)
				{
					System.out.print("* ");
				}
				else if(i>=5 && j<=10-i)
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
