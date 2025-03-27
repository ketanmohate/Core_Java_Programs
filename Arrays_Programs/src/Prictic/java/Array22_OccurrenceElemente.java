package Prictic.java;

/* 7) WAP to enter the 10 element array and print the occurrence of every element ?
a[0] a[1] a[2] a[3] a[4] a[5] a[6] a[7] a[8] a[9]
10 20 30 10 20 50 30 10 30 10
Output :
Element count
10 -------------------- 4
20 -------------------- 2
30 -------------------- 3
50 ------------------ 1
*/

import java.util.*;

public class Array22_OccurrenceElemente 
{
	 public static void main(String[] args) 
	 {
		 	Scanner sc = new Scanner(System.in);
		 	int[] a = new int[10];

	        // Input array elements
	        System.out.println("Enter array elements:");
	        
	        for (int i = 0; i < a.length; i++) 
	        {
	            a[i] = sc.nextInt();
	        }

	        // Print occurrences of each element
	        System.out.println("Element count:");
	        
	        for (int i = 0; i < a.length; i++) 
	        {
	            int count = 0;
	            
	            for (int j = 0; j < a.length; j++) 
	            {
	                if (a[i] == a[j]) 
	                {
	                    count++;
	                }
	            }
	            
	            
//	            boolean isPrinted = false;
	            int flag=0;
	            
	            for (int k = 0; k < i; k++)  // important line
	            {
	                if (a[k] == a[i]) 
	                {
//	                    isPrinted = true;
	                	flag=1;
	                    break;
	                }
	            }
//	            if (!isPrinted) 
	            if (flag==0) 
	            {
	                System.out.println(a[i] + " -------------------- " + count);
	            }
	        }
	    }
	}
