package GTH;

public class Pattern22 
{
	public static void main(String[] args) 
	{
		int count=3;
		for(int i=1 ; i<=7 ; i++)
		{
			for(int j=1 ; j<=4 ; j++)
			{
				if(i<=4 && j<=i)
				{
					System.out.print(count+" ");
				}
				else if(i>=5 && j<=8-i)
				{
					System.out.print(count+" ");
				}
			}
			
			System.out.println();
			if(i<=3)
			{
				++count;
			}
			else
			{
				--count;
			}
				
		}
	}

}
