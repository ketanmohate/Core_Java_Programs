package Day_09_02_2025;
import java.util.Scanner;
import java.util.Vector;

public class DuplicateFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Accept array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Using Vector to store found duplicates manually
        Vector<Integer> duplicates = new Vector<>();
        System.out.println("Duplicate values in the array:");
        boolean foundDuplicate = false;

        for (int i = 0; i < n; i++) {
            boolean alreadyStored = false;

            // Check if the number is already in the duplicate list
            for (int k = 0; k < duplicates.size(); k++) {
                if (duplicates.get(k) == arr[i]) {
                    alreadyStored = true;
                    break;
                }
            }

            if (alreadyStored) {
                continue; // Skip if already printed
            }

            // Check for duplicates in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicates.add(arr[i]); // Manually add to Vector
                    System.out.println(arr[i]);
                    foundDuplicate = true;
                    break; // Move to the next unique element
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate values found.");
        }

        sc.close();
    }
}
