package Day_09_01_2025;

public class Q4_Pattern4 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=6 ; i++)
		{
			int k=i;
			int count=1;
			
			for(int j=1 ; j<=11 ;j++)
			{
				if(j<=6 && j>=7-i)
				{
					System.out.print(k-- +" ");
				}
				else if(j>6 && j<=5+i)
				{
					System.out.print(++count +" ");
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
