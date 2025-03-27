package Test_P_18_07_2024;

/* Q2. WAP to print the following pattern? 
 
a
A B
a b c
A B C D
a b c d e
 */

public class Q2_Pattern1 
{

	public static void main(String[] args) 
	{
		
		for(int i = 1 ; i <= 5 ; i++)
		{
			if(i%2 != 0)
			{
				char ch = 'a';
				
				for(int j = 1 ; j <= i ; j++)
				{
					System.out.print(ch + " ");
					ch++; 
				}
				System.out.println("");
			}
			else
			{
				char ch='A';
				{
				for(int k = 1 ; k <=i ; k++)
				{
					System.out.print(ch + " ");
					ch++;
				}
				System.out.println("");
				}
			}
			
		}

	}

}

