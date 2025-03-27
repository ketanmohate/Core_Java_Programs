package com.java;

/*Write a java program to enter two angles of a triangle and find the third angle*/
import java.util.Scanner;
public class FindAngleOfTriangle
{
public static void main(String args[])
{
    int side1, side2, side3;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter First angles of triangle: ");
    side1 = scan.nextInt();
    System.out.print("Enter Second angles of triangle: ");
    side2 = scan.nextInt();
    side3 = 180 - (side1 + side2);
    System.out.println("Third angle of the triangle = "+ side3 );
}
}