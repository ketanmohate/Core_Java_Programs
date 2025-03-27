package Day_09_01_2025;

public class Q2_Pattern2 {
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=6 ; i++)
		{
			for(int j=1 ; j<=6 ; j++)
			{
				if(j<=i)
				{
					System.out.print( j+ " ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
