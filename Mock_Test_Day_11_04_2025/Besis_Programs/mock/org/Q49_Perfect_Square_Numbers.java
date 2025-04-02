package mock.org;

/*
 * 49. Perfect Square Numbers
Description: Write a program to find perfect square numbers up to n.
Input: n = 20
Output: 1 4 9 16
 */

import java.util.*;

public class Q49_Perfect_Square_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			if(i*i <n)
			{
				System.out.println(i*i);
			}
		}
	}

}
