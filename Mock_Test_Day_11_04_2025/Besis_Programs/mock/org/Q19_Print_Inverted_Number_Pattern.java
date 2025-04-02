package mock.org;

/*
 * 19. Print Inverted Number Pattern
Description: Write a program to print an inverted number pattern.
Input: n = 5


Output:

 Copy
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1

 */

public class Q19_Print_Inverted_Number_Pattern {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=5 ; i++)
		{
			int count = 5;
			for(int j=1 ; j<=5 ; j++)
			{
				if(i<=j)
				{
					System.out.print(count);
					count--;
				}
			}
			System.out.println();
		}

	}

}
