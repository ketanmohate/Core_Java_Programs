package Looping.programs;

/*36.	Write a C program to print Fibonacci series up to n terms.*/

import java.util.*;

public class Q36_Print_Fibonacci_Series {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        int first = 0;
        int second = 1;
        int next;
        
        System.out.println("Fibonacci Series");
        
        for (int i = 1; i <= n; i++) 
        {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
        
//        // method 2
//        int a = 0;
//        int b = 1;
//        int c = 0;
//
//        System.out.println("Fibonacci terms: \\n");
//
//        /* Iterate through n terms */
//        for(int i=1 ; i<=n ; i++)
//        {
//        	System.out.print(c + " ");
//
//            a = b;     // Copy n-1 to n-2
//            b = c;     // Copy current to n-1
//            c = a + b; // New term
//        }
    }
}
