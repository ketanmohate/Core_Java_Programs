package oop.org;

/*
 * Q5. WAP to create class name as CountDigit with two functions 
 void setValue(): this function can accept number from keyboard 
 void showDigitCount(): this function can count the digit and display it.
 */

import java.util.*;

class CountDigit
{
	int num;
	void setValue(int num)
	{
		this.num = num;
	}
	
	void showDigitCount()
	{
		int count = 0;
		while(num !=0)
		{
			count++;
			num = num / 10;
		}
		System.out.println("Number Of count\t" + count);
	}
}

public class Q5_Count_Digit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		CountDigit countD = new CountDigit();
		countD.setValue(num);
		countD.showDigitCount();
	}

}
