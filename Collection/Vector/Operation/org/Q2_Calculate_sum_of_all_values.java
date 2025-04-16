package Operation.org;

/*
 * Example: WAP to create Vector and store integer values in it and calculate sum of all values.
 */

import java.util.*;

public class Q2_Calculate_sum_of_all_values {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Vector vector = new Vector();
		
		vector.add(100);
		vector.add(200);
		vector.add(300);
		vector.add(400);
		vector.add(500);
		
		Iterator iterator = vector.iterator();
		
		int sum = 0;
		
		while(iterator.hasNext())
		{
			Object obj = iterator.next();
			
			sum = sum +(int) obj;
		}
		System.out.println("Sum Id\t" + sum);
	}

}
