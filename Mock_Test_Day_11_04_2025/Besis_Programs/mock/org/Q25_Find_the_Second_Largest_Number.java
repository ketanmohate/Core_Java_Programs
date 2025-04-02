package mock.org;

import java.util.Scanner;

public class Q25_Find_the_Second_Largest_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the tow Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a<b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}

}
