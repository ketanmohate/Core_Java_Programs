package GTH;

public class Pattern24 
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
					if(j%2==0)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(count+" ");
						count++;
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
		int count1=7;
		
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=7 ; j++)
			{
				if(j<=9-i*2)
				{
					if(j%2==0)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(count1+" ");
						count1++;
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			count1 = count1 - (i * 6 - 1);
			System.out.println();
		}
	}

}
