package Looping.programs;

/*20.	Write a C program to print all ASCII character with their values.*/

public class Q20_Public_Class_ASCII_Values
{
	public static void main(String[] args) 
	{
        for (int i = 0; i <= 127; i++) 
        {
            System.out.println("Character: " + (char) i + " | ASCII Value: " + i);
        }
	}
}
