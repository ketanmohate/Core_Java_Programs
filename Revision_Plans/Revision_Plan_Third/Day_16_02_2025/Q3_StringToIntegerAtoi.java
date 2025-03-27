package Day_16_02_2025;

/*
 Q3.String to Integer (atoi)
Problem: Implement atoi to convert a string to an integer. 
Hint: Carefully consider all possible input cases. 
If you want a challenge, please do not see below and ask yourself what are the possible input cases.
Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). 
You are responsible to gather all the input requirements up front. 
 */

/*
		Test cases
        System.out.println(myAtoi("42"));                 // 42
        System.out.println(myAtoi("   -42"));             // -42
        System.out.println(myAtoi("4193 with words"));    // 4193
        System.out.println(myAtoi("words and 987"));      // 0
        System.out.println(myAtoi("-91283472332"));       // Integer.MIN_VALUE (-2147483648)
        System.out.println(myAtoi("2147483648"));         // Integer.MAX_VALUE (2147483647)
 */

import java.util.Scanner;

public class Q3_StringToIntegerAtoi 
{
    public static int myAtoi(String s) 
    {
        if (s == null || s.isEmpty()) 
        {
            return 0;
        }

        int i = 0, sign = 1, num = 0;
        int len = s.length();

        // Step 1: Trim leading spaces
        while (i < len && s.charAt(i) == ' ') 
        {
            i++;
        }

        // Step 2: Check sign
        if (i < len && (s.charAt(i) == '+' || s.charAt(i) == '-')) 
        {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits to integer
        while (i < len && Character.isDigit(s.charAt(i))) 
        {
            int digit = s.charAt(i) - '0';

            // Step 4: Handle overflow & underflow
            if (num > (Integer.MAX_VALUE - digit) / 10) 
            {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }
        return num * sign;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int result = myAtoi(str);
        System.out.println("Converted Integer: " + result);
    }
}
