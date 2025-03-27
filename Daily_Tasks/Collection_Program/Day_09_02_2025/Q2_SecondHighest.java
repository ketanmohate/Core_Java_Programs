package Day_09_02_2025;

public class Q2_SecondHighest 
{
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20, 15};

        // Step 1: Assume first element as firstMax
        int firstMax = arr[0];
        int secondMax = arr[0]; // Temporary assignment, will be updated

        // Step 2: Find the real secondMax
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax; // Move firstMax to secondMax
                firstMax = arr[i];    // Update firstMax
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i]; // Update secondMax
            }
        }

        // Step 3: Ensure secondMax is updated properly
        if (firstMax == secondMax) {
            System.out.println("No second highest element found.");
        } else {
            System.out.println("Second highest element: " + secondMax);
        }
    }
}
