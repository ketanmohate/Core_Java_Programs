package mock.org;

/*
 * 23. Print Inverted Star Pattern
Description: Write a program to print an inverted star pattern.
Input: n = 4


Output:
 ****
***
**
*
 */

public class Q23_Print_Inverted_Star_Pattern {

	public static void main(String[] args) {

		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=4 ; j++)
			{
				if(j<=5-i)
				{
					System.out.print("* ");
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
