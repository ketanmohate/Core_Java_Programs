package GTH;

public class Pattern36 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			int flag=0;
			for(int j=1 ; j<=10 ; j++)
			{
				if(j<=5 && j<=i)
				{
					if(j%2==0)
					{
						System.out.print("1 ");
					}
					else
					{
						System.out.print("0 ");
					}
					
				}
				else if(j>5 && j>=11-i)
				{
					if(flag==0)
					{
						System.out.print("0 ");
						flag=1;
					}
					else
					{
						System.out.print("1 ");
						flag=0;
					}
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
