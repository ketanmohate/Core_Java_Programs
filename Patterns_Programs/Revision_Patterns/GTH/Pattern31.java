package GTH;

public class Pattern31 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=1 ; j<9 ; j++)
			{
				if(i==5 || j==3+i || j==13-i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			System.out.println();
		}
	}

}
