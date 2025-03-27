package GTH;

public class Pattern18 
{
	public static void main(String[] args) 
	{	
		for(int i=1 ; i<=5 ; i++)
		{
			int flag=1;
			for(int j=1 ; j<=17 ; j++)
			{
				if(j<=8 && j<=9-i)
				{
					System.out.print("* ");
				}
				else if(j>9 && j>=9+i)
				{
					System.out.print("* ");
				}
				else
				{
					if(flag==1)
					{
						System.out.print(i+" ");
						flag=0;
					}
					else
					{
						System.out.print("* ");
						flag=1;
					}
					
				}
			}
			
			System.out.println();
		}
	}

}
