package GTH;

public class Pattern38 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			int count=5-i;
			
			for(int j=1 ; j<=9 ; j++)
			{
				if(j<=6-i)
				{
					System.out.print(j+" ");
				}
				else if(j<=11-i*2)
				{
					System.out.print(count+" ");
					count--;
				}
			}
			System.out.println();
		}
	}

}
