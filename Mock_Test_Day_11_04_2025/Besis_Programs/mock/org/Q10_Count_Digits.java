package mock.org;

/*
 *10. Count Digits
Description: Write a program to count the number of digits in a number n.
Input: n = 12345


Output: 5
 */

import java.util.*;

public class Q10_Count_Digits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int count = 0;
		while(num !=0)
		{
			count++;
			num = num / 10;
		}
		System.out.println(count);
	}

}

