package Assignment_16_09_2024;

/*
 Assignment 6 
Problem 
There is a group of NN friends who wish to enroll in a course together. The course has a maximum 
capacity of MM students that can register for it. If there are KK other students who have already 
enrolled in the course, determine if it will still be possible for all the NN friends to do so or not. 
Input Format 
 The first line contains a single integer TT - the number of test cases. Then the test cases follow. 
 Each test case consists of a single line containing three integers NN, MM and KK - the size of the 
friend group, the capacity of the course and the number of students already registered for the 
course. 
 Output Format 
 For each test case, output Yes if it will be possible for all the NN friends to register for the 
course. Otherwise output No. 
 You may print each character of Yes and No in uppercase or lowercase (for 
example, yes, yEs, YES will be considered identical). 
Constraints 
1<=N<=M <=100 
0<=K<=M 
Sample1 
Input    
2 
5 
100 
50 
40 
100 
Explanation: 
27  
38  
0  
Output 
Yes  
NO 
Yes 
Test Case 1: The 22 friends can enroll in the course as it has enough seats to accommodate them and 
the  27  other students at the same time. 
Test Case 2: The course does not have enough seats to accommodate the 55 friends and the 3838 other 
students at the same time.
 */

import java.util.*;

public class Q6_Chef_Problem_Students_Already_Registered 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Read number of test cases
		System.out.println("Enter the No of test cases");
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++)
        {
    		System.out.println("Enter the No Of Student in Group");
    		int N = sc.nextInt();  // Number of friends
    		
    		System.out.println("Enter the Maximum Capacity ");
    		int M = sc.nextInt();  // Course capacity
    		
    		System.out.println("Enter the No of Student already enrolled in the course");
    		int K = sc.nextInt();  // Already registered students
    		
    		if (N + K <= M) 
    		{
    			System.out.println("Yes");
            }
    		else 
    		{
    			System.out.println("No");
    		}
        }
	}

}
