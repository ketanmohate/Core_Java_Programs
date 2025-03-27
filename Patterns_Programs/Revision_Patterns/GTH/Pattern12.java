package GTH;

public class Pattern12 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			int k=i;
			int count=i*2-2;
			
			for(int j=1 ; j<=9 ; j++)
			{
				if(j<=5 && j>=6-i)
				{
					System.out.print(k + " ");
					k++;
				}
				else if(j>=5 && j<=4+i)
				{
					System.out.print(count+" ");
					count--;
				}
				else
				{
					System.out.print("  ");	
				}
			}
			System.out.println();
		}
	}

}
