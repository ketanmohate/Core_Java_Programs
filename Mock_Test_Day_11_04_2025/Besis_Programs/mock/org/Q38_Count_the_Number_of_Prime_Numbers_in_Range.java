package mock.org;

/*
 * 38. Count the Number of Prime Numbers in a Range
Description: Write a program to count the number of prime numbers between m and n.
Input: m = 1, n = 10
Output: 4
 */

import java.util.*;

public class Q38_Count_the_Number_of_Prime_Numbers_in_Range {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String value");
		int m = sc.nextInt();
		
		System.out.println("Enter the End value");
		int n = sc.nextInt();
		
		int count =0;
		
		for(int i=m ; i<=n ; i++)
		{
			int c = 0;
			for(int j=2 ; j<=i ; j++)
			{
				if(i%j == 0)
				{
					c++;
				}
			}
			if(c==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
