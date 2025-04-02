package mock.org;

/*
 * 40. Number Pyramid Pattern
Description: Write a program to print a number pyramid pattern.
Input: n = 4


Output:

     1
   121
  12321
 1234321

 */

import java.util.*;

public class Q40_Number_Pyramid_Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			int count = 1;
			for(int j=1 ; j<=(n*2)-1 ; j++)
			{
				if(j>(n-i) && j<(n+i))
				{
					if(j<n)
					{
						System.out.print(count++);
					}
					else
					{
						System.out.print(count--);
					}
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
