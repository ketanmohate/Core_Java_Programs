package Assignment_16_09_2024;

/*
 Assignment 7 
A study has shown that playing a musical instrument helps in increasing one's IQ by 77 points. Chef 
knows he can't beat Einstein in physics, but he wants to try to beat him in an IQ competition. 
You know that Einstein had an IQ of 170170, and Chef currently has an IQ of XX. 
Determine if, after learning to play a musical instrument, Chef's IQ will become strictly greater 
than Einstein's. 
Print "Yes" if it is possible for Chef to beat Einstein, else print "No" (without quotes). 
You may print each character of the string in either uppercase or lowercase (for example, the 
strings yEs, yes, Yes, and YES will all be treated as identical). 
Input Format 
 The first and only line of input will contain a single integer XX, the current IQ of Chef. 
Output Format 
 For each testcase, output in a single line "Yes" or "No" 
 You may print each character of the string in either uppercase or lowercase (for example, the 
strings yEs, yes, Yes, and YES will all be treated as identical). 
Constraints 
100<=X<=169 
Sample1 
Input   
165   
Explanation 
Output 
Yes 
After learning a musical instrument, Chef's final IQ will be 165+7=172. Since 172 >= 170 Chef 
can beat Einstein. 
Sample2 
Input   
120   
Explanation: 
Output 
No 
After learning a musical instrument, Chef's final IQ will be 120+7=127120+7=127. Since 127    
127<170, Chef cannot beat Einstein.
 */

import java.util.Scanner;

public class Q7_Chef_Problem_Chef_IQ 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Chef's current IQ: ");
        int chefIQ = sc.nextInt();

        System.out.print("Enter einstein IQ : ");
        int einsteinIQ = sc.nextInt();
		
       	int increasedIQ = chefIQ + 7;
        if (increasedIQ > einsteinIQ) 
		{
			System.out.println("Yes");
		}
		else 
		{
			System.out.println("No");
		}
	}

}
