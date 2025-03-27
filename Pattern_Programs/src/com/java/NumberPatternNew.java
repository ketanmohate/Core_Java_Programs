package com.java;
public class NumberPatternNew {
    public static void main(String[] args) {
    	char c='A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" %c ",c+j-1);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.printf(" %c ",c+j-1);
            }
            System.out.println();
        }
    }
}//Alphabate