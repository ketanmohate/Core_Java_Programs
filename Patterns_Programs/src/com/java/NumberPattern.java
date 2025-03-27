package com.java;
public class NumberPattern {
    public static void main(String[] args) {
        int n = 3; // This defines the height of the peak

        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print the increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print the decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print the increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print the decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
