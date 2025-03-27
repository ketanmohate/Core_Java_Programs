package Date_04__08_2024;

/* Example4:
Masterchef finals
Chef has been working hard to compete in MasterChef.He is ranked X out of all contestants. 
However, only 
10 contestants would be selected for the finals.Check whether Chef made it to the top 10 or not?
Input Format
The first line of input will contain a single integer T denoting the number of test cases.
Each test case consists of one integers X the current rank of Chef.
Output Format
For each test case, output on a new line, YES, if Chef made it to the top 10 and NO otherwise.
Each character of the output may be printed in either uppercase or lowercase. That is, the strings 
NO, no, nO, and No will be treated as equivalent.
Masterchef finals
Chef has been working hard to compete in MasterChef.He is ranked X out of all contestants. 
However, only 
10 contestants would be selected for the finals.Check whether Chef made it to the top 10 or not?
Input Format
The first line of input will contain a single integer T denoting the number of test cases.
Each test case consists of one integers X the current rank of Chef.
Output Format
For each test case, output on a new line, YES, if Chef made it to the top 10 and NO otherwise.
Each character of the output may be printed in either uppercase or lowercase. That is, the strings 
NO, no, nO, and No will be treated as equivalent.
Constraints
1≤T≤100
1≤X≤100
 */

import java.util.*;

public class P5_Masterchef_finals 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Read the number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) 
        {
            // Read the rank of Chef
            int X = sc.nextInt();
            
            // Check if Chef is in the top 10
            if (X <= 10) 
            {
                System.out.println("YES");
            } 
            
            else 
            {
                System.out.println("NO");
            }
        }

	}

}
