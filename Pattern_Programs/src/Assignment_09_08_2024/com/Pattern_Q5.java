package Assignment_09_08_2024.com;

/* 
Pattern
 
1         
A B       
2 3 4     
C D E F   
5 6 7 8 9 

End
*/

public class Pattern_Q5 
{
	public static void main(String[] args) 
	{
		int count = 1;
		char ch = 'A';
		
		for(int i = 1 ; i <=5 ; i++)
		{
			for(int j = 1 ; j <=5 ; j++)
			{
				if(i>=j)
				{
					if(i%2 != 0)
					{
						System.out.print(count + " ");
						count++;
					}
					else
					{
						System.out.print(ch + " ");
						ch++;
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}

	}

}
