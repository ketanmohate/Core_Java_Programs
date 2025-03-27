package GTH;

public class Pattern14 
{
	public static void main(String[] args)
	{
		int count=1;
		
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(j==1)
				{
					System.out.print(i+ " ");
				}
				else if(i==1)
				{
					System.out.print(j+" ");
				}
				else if(j==6-i)
				{
					System.out.print("5 ");
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
