package GTH;

public class Pattern13 
{
	public static void main(String[] args) 
	{
		int count=1;
		
		for(int i=1 ; i<=5 ; i++)
		{
			int flag=0;
			
			for(int j=1 ; j<=9 ; j++)
			{
				if(j<=5 && j==6-i && flag==0)
				{
					System.out.print(count + " ");
					flag=1;
				}
				else if(j>=5 && j==4+i && flag==0)
				{
					System.out.print(i +" ");
					flag=1;
				}
				else if(i==5 && flag==0)
				{
					System.out.print(++count +" ");
					flag=1;
				}
				else
				{
					System.out.print("  ");
					flag=0; 
				}
			}
			System.out.println();
		}
	}

}
