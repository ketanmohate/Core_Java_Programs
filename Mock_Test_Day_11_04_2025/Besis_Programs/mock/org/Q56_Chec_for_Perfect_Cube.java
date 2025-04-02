package mock.org;

/*
 54. Check for Perfect Cube
Description: Write a program to check if a number is a perfect cube.
Input: n = 27


Output: Perfect Cube
 */

import java.util.*;

public class Q56_Chec_for_Perfect_Cube {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		boolean isCube = false;
		for(int i=1 ; i<=n ; i++)
		{
			if(i*i*i == n)
			{
				isCube = true;
	            break;
			}
		}
		if(isCube)
		{
			System.out.println("Perfect Cube");
		}
		else
		{
			System.out.println("Not Perfect Cube ");
		}
	}

}

