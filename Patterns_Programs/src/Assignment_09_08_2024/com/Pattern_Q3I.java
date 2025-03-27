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

public class Pattern_Q3I 
{
	public static void main(String[] args) 
	{
		for(int i = 0 ; i < 5 ; i++)
		{
			int ch = 65;
			
			for(int j = 0 ; j <5 ; j++)
			{
				
				System.out.printf("%c " , (ch + i));
				ch++;
			}
			System.out.println("");
		}

	}

}
