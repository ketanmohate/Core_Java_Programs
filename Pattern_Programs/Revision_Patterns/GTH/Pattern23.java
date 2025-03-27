package GTH;

public class Pattern23 
{
	public static void main(String[] args) 
	{
		int count=1;
		
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=7 ; j++)
			{
				if(j<=i*2-1)
				{
					if(j%2 == 0)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(i+" ");
					}
				}
				else
				{
					System.out.print("  ");
				}
			}

			System.out.println();
		}
		
		int k=4;
		for(int i=1 ; i<=4 ; i++)
		{	
			for(int j=1 ; j<=7 ; j++)
			{
				if(j<=9-i*2)
				{
					if(j%2 == 0)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(k+" ");
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			k--;
			System.out.println();
		}
	}

}
