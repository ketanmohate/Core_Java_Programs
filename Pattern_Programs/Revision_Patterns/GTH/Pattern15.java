package GTH;

public class Pattern15 
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=11 ; j++)
			{
				if(j<=i && j<=5)
				{
					System.out.print(j+" ");
				}
				else if(j<=2*i-1)
				{
					System.out.print(count+" ");
					count--;
				}
				else
				{
					System.out.print("  ");
				}
			}
			count=count+i;
			System.out.println();
		}
	}

}
