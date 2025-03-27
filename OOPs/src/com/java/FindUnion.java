package com.java;

public class FindUnion {
    private int[] arrayA;
    private int[] arrayB;
    private int[] unionArray;

    // Method to set the arrays
    public void setArray(int[] a, int[] b) {
        this.arrayA = a;
        this.arrayB = b;
    }

    // Method to find the union of two arrays
    public void findUnion() {
        int n = arrayA.length;
        int m = arrayB.length;
        int[] tempUnionArray = new int[n + m];
        int k = 0;

        // Copy all elements of arrayA to tempUnionArray
        for (int i = 0; i < n; i++) {
            tempUnionArray[k++] = arrayA[i];
        }

        // Copy elements of arrayB to tempUnionArray if they are not already present
        for (int j = 0; j < m; j++) {
            boolean isPresent = false;
            for (int i = 0; i < n; i++) {
                if (arrayB[j] == arrayA[i]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                tempUnionArray[k++] = arrayB[j];
            }
        }

        // Create the final unionArray with the correct size
        unionArray = new int[k];
        for (int i = 0; i < k; i++) {
            unionArray[i] = tempUnionArray[i];
        }
    }

    // Method to print the union array
    public void printUnionArray() {
        System.out.print("Union of the two arrays: ");
        for (int num : unionArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FindUnion findUnion = new FindUnion();
        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = {4, 5, 6, 7, 8};

        findUnion.setArray(arrayA, arrayB);
        findUnion.findUnion();
        findUnion.printUnionArray();
    }
}
