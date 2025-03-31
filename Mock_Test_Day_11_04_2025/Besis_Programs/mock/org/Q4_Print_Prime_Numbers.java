package mock.org;

/*
 4. Prime Numbers
Description: Write a program to print all prime numbers up to a given number n.
Input: n = 10


Output: 2 3 5 7
 */

import java.util.*;

public class Q4_Print_Prime_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		for(int i=2 ; i<=n ; i++)
		{
			int count = 0;
			for(int j=2 ; j<=i ; j++)
			{
				if(i%j == 0)
				{
					count ++;
				}
			}
			if(count <2)
			{
				System.out.println(i);
			}
		}
	}

}
