package com.java;

/* Q9. Write a java program to input basic salary of an employee and calculate its Gross salary according to following :
Basic Salary <= 10000 : HRA(House Rent Allowance) = 20%, DA(Dearness Allowance) = 80%
Basic Salary <= 20000 : HRA(House Rent Allowance) = 25%, DA(Dearness Allowance) = 90%
Basic Salary > 20000 : HRA(House Rent Allowance) = 30%, DA(Dearness Allowance) = 95% */

import java.util.Scanner;

public class GrossSalaryCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary of the employee: ");
        double basicSalary = scanner.nextDouble();
        double hra, da, grossSalary;
        if (basicSalary <= 10000) 
        {
            hra = 0.20 * basicSalary;
            da = 0.80 * basicSalary;
        } 
        else if (basicSalary <= 20000) 
        {
            hra = 0.25 * basicSalary;
            da = 0.90 * basicSalary;
        } 
        else 
        {
            hra = 0.30 * basicSalary;
            da = 0.95 * basicSalary;
        }
        grossSalary = basicSalary + hra + da;
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
    }
}
