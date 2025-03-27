package com.java;

/*Write a java program to enter two angles of a triangle and find the third angle*/
import java.util.Scanner;
public class FindAngleOfTriangle
{
public static void main(String args[])
{
    int a, b, c;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter First angles of triangle: ");
    a = scan.nextInt();
    System.out.print("Enter Second angles of triangle: ");
    b = scan.nextInt();
    c = 180 - (a + b);
    System.out.println("Third angle of the triangle = "+c);
}
}