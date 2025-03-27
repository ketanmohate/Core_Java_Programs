package com.java;
/* write a program to create the menu driven using do while loop and perfom the operation using swich case
  
   do{
       // enter the choice form user
   
    	switch(choice)
    	{
 	 case 1 :
            	Write a java program to find all factors of a number.
           	break;
 	case 2: 
          	 Write a Java program to find power of a number using for loop.
           	break;
 	case 3: 

		Write a java program to print all Prime numbers between 1 to n.
        	break;

	case 4: 
          	Write a Java program to check whether a number is Strong number or not.
       		break;
	case 5:
      		Write a Java program to print Fibonacci series up to n terms.
       		break;
        case 6:
                   exit

        }

   }while(choice<6); */

import java.util.*;

public class DoWhileLoop1
{
	public static void main(String args[])
	{
		int choise;
		
		Scanner scan = new Scanner(System.in);
		
		int num;
			
		char ch;

		do
		{
			System.out.println("1. Find factors of a number");
			System.out.println("2. Find power of a number");
			System.out.println("3. Print Prime numbers");
			System.out.println("4. Check whether a number is Strong number or not");
			System.out.println("5. Print Fibonacci series");
	
			System.out.println("Enter your choise:");
			choise = scan.nextInt();
		
			switch (choise)
			{
				case 1:
					System.out.println("Enter the number:");
					num = scan.nextInt();
        				int i = 1;
					
					System.out.println("Factors of " + num + " are: ");

        				while (i <= num) 
					{
            					if (num % i == 0) 	
						{
                					System.out.println(i);
            					}
            					i++;
					}
					break;
				
				case 2:
					System.out.println("Enter a base number: ");
        				double base = scan.nextDouble();

        				System.out.println("Enter an exponent: ");
        				int exponent = scan.nextInt();

        				double result = 1.0;
        				int ii = 0;

        				while (ii < exponent) 
					{
            					result *= base;
            					ii++;
        				}
        				System.out.println(base + " raised to the power of " + exponent + " is: " + result);
					break;
				
				case 3:	
					System.out.println("Enter a number: ");
        				num = scan.nextInt();
   
        				int iii = 2;

					System.out.println("Prime numbers up to " + num + " are: ");

					while (iii <= num) 
					{
            					int flag = 0;
            					int j = 2;

            					while (j * j <= iii) 	
						{
                					if (iii % j == 0) 
							{
                    						flag = 1;
                    						break;
                					}
                					j++;
            					}
            					if (flag == 1) 
						{
                					System.out.println(iii);
            					}
            					iii++;
        				}				
					break;

				case 4:
					System.out.println("Enter a number: ");
        				num = scan.nextInt();

        				int sum = 0;
        				int temp = num;
        				int digit,fact,iiii;

        				while (temp > 0) 
					{
            					digit = temp % 10;
            					fact = 1;
            					iiii = 1;

            					while (iiii <= digit) 
						{
                					fact *= iiii;
                					iiii++;
            					}
            					sum += fact;
            					temp /= 10;
        				}

        				if (sum == num) 
					{
            					System.out.println(num + " is a Strong number");
        				} 
					else 
					{
            					System.out.println(num + " is not a Strong number");
        				}
					break;
	
				case 5:
					System.out.println("Enter a number: ");
					num = scan.nextInt();

        				int a = 0;
        				int b = 1;
			
        				System.out.println("Fibonacci series: ");
	
        				while (a <= num) 
					{
            					System.out.println(a);
            					int sum1 = a + b;
            					a = b;
            					b = sum1;
        				}
					break;
				default:
					System.out.println("Invalid");

			}
			System.out.println("Do you want to Countinue(y/n)");
			ch = scan.next().charAt(0);
		}while(ch == 'y');
	}
}





		






