package com.java;
import java.util.Scanner;

public class TelephoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of telephone calls
        System.out.print("Enter the number of telephone calls: ");
        int numberOfCalls = scanner.nextInt();

        double billAmount = calculateBill(numberOfCalls);

        // Display the calculated bill amount
        System.out.printf("The monthly telephone bill is: ₹ %.2f%n", billAmount);

        scanner.close();
    }

    public static double calculateBill(int calls) {
        double bill = 0.0;

        if (calls <= 100) {
            bill = 200;
        } else if (calls <= 150) {
            bill = 200 + (calls - 100) * 0.7;
        } else if (calls <= 200) {
            bill = 200 + 50 * 0.7 + (calls - 150) * 0.6;
        } else {
            bill = 200 + 50 * 0.7 + 50 * 0.6 + (calls - 200) * 0.5;
        }

        return bill;
    }
}
