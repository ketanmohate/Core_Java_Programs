package GTH;

public class Pattern19 
{
	public static void main(String[] args) 
	{
		int flag1=0;
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=9 ; j++)
			{
				if(j<=5 && j>=6-i && flag1==0)
				{
					System.out.print("* ");
					flag1=1;
				}
				else if(j>=5 && j<=4+i && flag1==0)
				{
					System.out.print("* ");
					flag1=1;
				}
				else
				{
					System.out.print("  ");
					flag1=0;
				}
			}
			System.out.println();
		}
		
		int flag=1;
		
		for(int i=1 ; i<=5 ; i++)
		{	
			for(int j=1 ; j<=9 ; j++)
			{
				if(j<=5 && j>=i && flag==1)
				{
					System.out.print("* ");
					flag=0;
				}
				else if(j>5 && j<=10-i && flag==1)
				{
					System.out.print("* ");
					flag=0;
				}
				else
				{
					System.out.print("  ");
					flag=1;
				}
			}
			System.out.println();
		}
	}
}
