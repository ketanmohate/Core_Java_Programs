package GTH;

public class Pattern37 
{
	public static void main(String[] args) 
	{
		int count=1;
		for(int i=1 ; i<=5 ; i++)
		{
			count=1*i;
			for(int j=1 ; j<=10 ; j++)
			{
				if(j<=5 && j<=i)
				{
					System.out.print(j+	" ");
				}
				else if(j>5 && j>=11-i)
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
