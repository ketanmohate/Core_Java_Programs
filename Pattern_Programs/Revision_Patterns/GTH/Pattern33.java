package GTH;

public class Pattern33 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=7 ; j++)
			{
				if(j<=8-i && j>=5-i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
