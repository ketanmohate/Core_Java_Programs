package com.java;
/*Write a java program to take a 4 digit number as command line argument, reverse the 
number and also find the sum of digits. 
   Ex. input  :   3829 
        Output : Reverse number = 9283 
                         Sum=22 
  // rev = (num % 10)*1000 + ((num /10)%10)*100 + ((num /100)%10)*10 + (num/1000);
*/

public class ReverseNumSum
{
	public static void main(String x[])
	{
		int number;
		System.out.println("Enter the number:");
		number	 = Integer.parseInt(x[0]);
		int digit1 = number / 1000;
        int digit2 = (number % 1000) / 100;
        int digit3 = (number % 100) / 10;
        int digit4 = number % 10;
		int reversedNumber = digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1;
		int sumOfDigits = digit1 + digit2 + digit3 + digit4;
        	System.out.println("Reversed number: " + reversedNumber);
        	System.out.println("Sum of digits: " + sumOfDigits);
	}
}



