package mock.org;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.next();
        sc.close();

        char[] arr = str.toCharArray();
        
        int n = arr.length;
        
        int[] count = new int[n];

        System.out.println("All Permutations:");
        System.out.println(new String(arr)); // Print initial order

        int i = 0;
        while (i < n)
        {
            if (count[i] < i) 
            {
                if (i % 2 == 0) 
                {
                    // Swap first element with i-th element
                    char temp = arr[0];
                    arr[0] = arr[i];
                    arr[i] = temp;
                } 
                else 
                {
                    // Swap i-th element with the previous one
                    char temp = arr[count[i]];
                    arr[count[i]] = arr[i];
                    arr[i] = temp;
                }

                System.out.println(new String(arr)); // Print current permutation
                count[i]++;
                i = 0; // Reset i for next permutation
            } 
            else 
            {
                count[i] = 0;
                i++;
            }
        }
    }
}
