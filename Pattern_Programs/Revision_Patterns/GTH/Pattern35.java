package GTH;

public class Pattern35 
{
	public static void main(String[] args) 
	{
		int count=1;
		int flag=0;
		
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=7 ; j++)
			{
				if(j<5 && j>=5-i && flag==0)
				{
					System.out.print(count+" ");
					count++;
					flag=1;
				}
				else if(j>=5 && j<=3+i && flag==0)
				{
					System.out.print(count+" ");
					count++;
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
