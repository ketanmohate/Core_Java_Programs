package mock.org;

/*
 * 4. Find the Kth Smallest Element in an Array
Description: Find the kth smallest element in an unsorted array.

Input: [12, 3, 5, 7, 19], k = 2

Output: 5
 */

import java.util.Scanner;

public class Q4_Find_the_N_th_Smallest_Element_in_an_Array {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k value
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Sorting manually using Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap without built-in functions
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display the Kth smallest element
        if (k > 0 && k <= n) {
            System.out.println("The " + k + "th smallest element is: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of k!");
        }
	}

}
