package Day_09_01_2025;

public class Q3_Pattern3 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=6 ;i++)
		{
			for(int j=1 ; j<=i ;j++)
			{
				if(i==j || i==j+2 || i==j+4)
				{
					System.out.print("1 ");
					
				}
				else 
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
