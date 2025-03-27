package Assignment_16_09_2024;

import java.util.*;
/*
 Problem 
Ezio can manipulate at most XX number of guards with the apple of Eden. 
Given that there are YY number of guards, predict if he can safely manipulate all of them. 
Input Format 
First line will contain TT, number of test cases. Then the test cases follow. 
Each test case contains of a single line of input, two integers XX and YY. 
Output Format 
For each test case, print text {YES} YES if it is possible for Ezio to manipulate all the guards. Otherwise, 
print  text {NO} NO. 
You may print each character of the string in uppercase or lowercase  
(For example, the strings text {Yes} YeS, text {yEs} yEs, \text {yes}yes and \text {YES}YES will all be 
treated as identical). 
Constraints 
1<=T<=100 
1<=X<=Y 
Sample1 
_______________
Input    Output 
 3 
5    7    NO 
6    6    YES 
9    1    YES 
 
Explanation: 
Test Case 11: Ezio can manipulate at most 55 guards. Since there are 77 guards, he cannot manipulate 
all of them. 
 
Test Case 22: Ezio can manipulate at most 66 guards. Since there are 66 guards, he can manipulate all of 
them. x
 
Test Case 33: Ezio can manipulate at most 99 guards. Since there is only 11 guard, he can manipulate the 
guard
 */
public class Q4_Chef_Problem_Ezio_Guards 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases
        
        for (int i = 0; i < T; i++) 
        {
            int X = sc.nextInt();  // Maximum number of guards Ezio can manipulate
            int Y = sc.nextInt();  // Number of guards present
            
            if (X >= Y) 
            {
                System.out.println("YES");
            } 
            else 
            {
                System.out.println("NO");
            }
        }
	}
}
