package mock.org;

/*
 * 52. Find Least Common Multiple (LCM)
Description: Write a program to find the least common multiple (LCM) of two numbers.
Input: a = 12, b = 15


Output: 60
 */

import java.util.*;

public class Q52_Find_Least_Common_Multiple_LCM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two value");
		int a = sc.nextInt();
		int b = sc.nextInt();

        int gcd = a, temp = b;
        
        while (temp != 0) 
        {
            int remainder = gcd % temp;
            gcd = temp;
            temp = remainder;
        }
        
        int lcm = (a * b) / gcd;
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
	}

}
