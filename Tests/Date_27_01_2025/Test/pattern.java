package Test;

public class pattern
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<10 ;j++)
			{
				if(j>=11-i*2)
				{
					if(j %2 == 0)
					{
						System.out.print("#");
					}
					else
					{
						System.out.print(i);
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		int count=5;
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=9 ;j++)
			{
				if(j+1>=2*i)
				{
					if(j % 2 == 0)
					{
						System.out.print("#");
					}
					else
					{
						System.out.print(count);
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			count--;
			System.out.println();
		}
	}
}