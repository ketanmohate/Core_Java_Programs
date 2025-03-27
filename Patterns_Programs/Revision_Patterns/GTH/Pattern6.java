package GTH;

public class Pattern6 
{
	public static void main(String[] args) 
	{	
		for(int i=1 ; i<=6 ; i++)
		{
			int flag=0;
			
			for(int j=1 ; j<=11 ; j++)
			{
				if(j<=6 && j>=7-i && flag==0)
				{
					System.out.print("* ");
					flag=1;
				}
				else if(j>=6 && j<=5+i && flag==0)
				{
					System.out.print("* ");
					flag=1;
				}
				else 
				{
					System.out.print("  ");
					flag=0;
				}
			}
			System.out.println();
		}
	}

}
