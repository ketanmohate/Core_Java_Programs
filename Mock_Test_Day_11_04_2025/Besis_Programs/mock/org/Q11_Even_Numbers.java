package mock.org;

/*
 * 11. Even Numbers
Description: Write a program to print all even numbers between 1 and n.
Input: n = 10


Output: 2 4 6 8 10
 */

import java.util.*;

public class Q11_Even_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}

}
