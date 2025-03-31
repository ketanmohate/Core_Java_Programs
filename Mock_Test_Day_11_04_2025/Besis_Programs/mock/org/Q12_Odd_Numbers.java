package mock.org;

/*
 * 12. Odd Numbers
Description: Write a program to print all odd numbers between 1 and n.
Input: n = 10


Output: 1 3 5 7 9
 */

import java.util.Scanner;

public class Q12_Odd_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
			}
		}
	}

}
