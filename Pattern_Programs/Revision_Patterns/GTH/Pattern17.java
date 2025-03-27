package GTH;

public class Pattern17 
{
	public static void main(String[] args) 
	{
		int count2=0;
		for(int i=1 ; i<=5 ; i++)
		{
			int count=1;
			
			for(int j=1; j<=9 ; j++)
			{
				if(j>=6-i && j<=5)
				{
					System.out.print(count+" ");
					count++;
				}
				else if(j>5 && j<=4+i)
				{
					System.out.print(count2+" ");
					count2--;
				}
				else
				{
					System.out.print("  ");
				}
			}
			count2=count2+i;
			System.out.println();
		}

	}

}
