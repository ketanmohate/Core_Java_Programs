package com.java;
import java.util.Scanner;
public class ADITION_OF_TOW_NUMBER_INPUTE_FROM_USER {

	public static void main(String[] args) {
		int a,b,sum;
		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter the 1st number");
			a=myObj.nextInt();
			System.out.println("Enter the 2nd number");
			b=myObj.nextInt();
		}
		sum=a+b;
		System.out.println("Adition of tow number:-"+sum);

	}

}
