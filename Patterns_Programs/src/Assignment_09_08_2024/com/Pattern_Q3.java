package Assignment_09_08_2024.com;

/* 
Pattern
 
A B C D E 
B C D E F 
C D E F G 
D E F G H 
E F G H I

End
*/

public class Pattern_Q3 
{
	public static void main(String[] args) 
	{
		for(int i = 0 ; i < 5 ; i++)
		{
			char ch = (char) ('A' + i);
			
			for(int j = 0 ; j < 5 ; j++)
			{
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println("");
		}

	}

}
