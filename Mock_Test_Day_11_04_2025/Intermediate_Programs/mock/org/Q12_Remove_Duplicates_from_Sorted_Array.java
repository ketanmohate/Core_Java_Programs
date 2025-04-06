package mock.org;

/*
 * 12. Remove Duplicates from Sorted Array
Description: Remove duplicates from a sorted array and return the new length.

Input: [1, 1, 2]

Output: 2
 */

import java.util.*;

public class Q12_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array to ensure correct behavior
        Arrays.sort(arr);

        int i = 0; // Pointer for unique elements

        for (int j = 1; j < arr.length; j++) 
        {
            if (arr[j] != arr[i])
            {
                i++;
                arr[i] = arr[j]; // Move unique element forward
            }
        }

        System.out.println("New Length: " + (i + 1));

    }
}
