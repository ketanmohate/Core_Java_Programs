package GTH;

public class Pattern40 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			int ch = 65;
			int chh= 70-i;
			
			for(int j=1 ; j<=9 ; j++)
			{
				if(j<5 && j<=6-i)
				{
					System.out.printf("%C",ch++);
				}
				else if(j>=5 && j>=4+i)
				{
					System.out.printf("%c",chh--);
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
