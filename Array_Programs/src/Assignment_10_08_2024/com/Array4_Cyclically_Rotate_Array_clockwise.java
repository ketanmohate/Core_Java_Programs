package Assignment_10_08_2024.com;

import java.util.Scanner;

public class Array4_Cyclically_Rotate_Array_clockwise
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array size:");
        int size = sc.nextInt();
        
        int a[] = new int[size];
        
        System.out.println("Enter the values of the array:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        
        // Display array
        System.out.println("Original Array:");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        // Main Logic
        System.out.println("Enter how many times to rotate the array:");
        int rotation = sc.nextInt();
        
        System.out.println("Rotated Array clockwise:");
        for(int n = 0; n < rotation; n++)
        {
            // Save the last element
            int temp = a[a.length - 1];
            
            // Shift all elements to the right by one position
            for(int i = a.length - 1; i > 0; i--)
            {
                a[i] = a[i - 1];
            }
            
            // Move the last element to the first position
            a[0] = temp;
        }
        
        // Display the rotated array
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
