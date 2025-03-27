package Assignment_16_09_2024;

/*
 Problem 
Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X 
is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction 
(including bank charges). For each successful withdrawal the bank charges 0.50 $US. 
Calculate Pooja's account balance after an attempted transaction. 
Input 
Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw. 
Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance. 
Output 
Output the account balance after the attempted transaction, given as a number with two digits of 
precision. If there is not enough money in the account to complete the transaction, output the current 
bank balance. 
Example - Successful Transaction 
Input: 
30 120.00 
Output: 
89.50 
Example - Incorrect Withdrawal Amount (not multiple of 5) 
Input: 
42 120.00 
Output: 
120.00 
Example - Insufficient Funds 
Input: 
300 120.00 
Output: 
120.00 
 */

import java.util.*;

public class Q3_Chef_Problem_ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        // Input: X is the withdrawal amount, Y is the initial account balance
        int X = sc.nextInt();        // Withdrawal amount
        double Y = sc.nextDouble();  // Initial account balance

        // Bank charges for a successful transaction
        double bankCharges = 0.50;

        // Check if X is a multiple of 5 and if the account balance is sufficient
        if (X % 5 == 0 && (X + bankCharges) <= Y) 
        {
            // Successful transaction
            Y = Y - X - bankCharges;
        }

        // Output the account balance
        System.out.printf("%.2f", Y);
        
	}

}
