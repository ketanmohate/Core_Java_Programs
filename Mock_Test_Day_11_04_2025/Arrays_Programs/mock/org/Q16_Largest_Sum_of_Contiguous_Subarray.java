package mock.org;

import java.util.Scanner;

/*
 * 16. Find the Largest Sum of Contiguous Subarray
Description: Find the largest sum of a contiguous subarray in a given array.

Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]

-2
1
-3
4
-1
2
1
-5
4
Output: 6
 */

public class Q16_Largest_Sum_of_Contiguous_Subarray {

	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // currentMax = max(nums[i], currentMax + nums[i]) without using Math.max
            if (currentMax + nums[i] > nums[i]) {
                currentMax = currentMax + nums[i];
            } else {
                currentMax = nums[i];
            }

            // maxSoFar = max(maxSoFar, currentMax)
            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
        }

        System.out.println("Maximum subarray sum is: " + maxSoFar);
    }

}
