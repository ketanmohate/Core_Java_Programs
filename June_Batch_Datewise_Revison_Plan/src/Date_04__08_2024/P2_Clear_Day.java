package Date_04__08_2024;

/* Example2:
Clear Day
Chef classifies a day to be either rainy, cloudy, or clear.
In a particular week, Chef finds X days to be rainy and Y days to be cloudy.
Find the number of clear days in the week.
Input Format
 The first and only line of input will contain two space-separated integers X and Y, denoting 
the number of rainy and cloudy days in the week.
Output Format
Output the number of clear days in the week.
Constraints
 0≤X, Y≤7
 0≤X+Y≤7
Sample 1:
Input Output
2 3 2
Explanation:
There are 7 days in a week. If there are 2 rainy days and 3 cloudy days, then the remaining 7−2−3=2
days are clear.
 */

import java.util.*;

public class P2_Clear_Day 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rainy in a week");
		int x = sc.nextInt();
		
		System.out.println("Enter the days in a week");
		int y = sc.nextInt();
		
		int clearday = 7 - (x + y);
		
		System.out.println("days are clear.");
		System.out.println(clearday);
	}

}
