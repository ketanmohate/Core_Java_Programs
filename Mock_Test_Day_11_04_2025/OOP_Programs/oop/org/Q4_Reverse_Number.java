package oop.org;

/*
 * Q4. WAP to create class name as Reverse with two functions 
void setNumber(): this function can accept the number from keyboard 
void reverseNumber(): this function can reverse the number and display it
 */

import java.util.*;

class Reverse
{
	int num;
	void setnumber(int num)
	{
		this.num = num;
	}
	
	void reverceNumber()
	{
		int rev = 0;
		
		while(num != 0)
		{
			int digit = num % 10;
			rev = (rev * 10) + digit;
			num = num / 10;
		}
		System.out.println(rev);
	}
	
}

public class Q4_Reverse_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		Reverse rev = new Reverse();
		rev.setnumber(num);
		rev.reverceNumber();
	}
}
