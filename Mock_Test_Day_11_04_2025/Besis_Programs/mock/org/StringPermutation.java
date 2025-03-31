package mock.org;
import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int n = str.length();
        
        // Using an array for swapping
        char[] arr = str.toCharArray();

        // Factorial-based iteration to generate permutations
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        System.out.println("All permutations:");
        for (int i = 0; i < fact; i++) {
            System.out.println(new String(arr));

            // Find the rightmost char smaller than its next character
            int j = n - 2;
            while (j >= 0 && arr[j] >= arr[j + 1]) {
                j--;
            }

            // If found, find the smallest char greater than arr[j] and swap
            if (j >= 0) {
                int k = n - 1;
                while (arr[k] <= arr[j]) {
                    k--;
                }
                char temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
            }

            // Reverse the part after index j
            int left = j + 1, right = n - 1;
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        sc.close();
    }
}
