package mock.org;

/*
 *26. Multiplication of Two Numbers
Description: Write a program to multiply two numbers using loops.
Input: a = 3, b = 5
Output: 15
 */

import java.util.*;

public class Q26_Multiplication_of_Two_Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the tow Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int mul = a * b;
		
		System.out.println(mul);
	}

}
