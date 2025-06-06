package Day_11_03_2025;

/*
 Q5. HashMap Basic Operations
Create a HashMap to store key-value pairs, and perform operations such as 
1:insertion, 
2:deletion,
3:retrieval.
 */

import java.util.*;

public class Q5_HashMap_Operations 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Map <Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		
		do {
			System.out.println("========================================================");
			System.out.println("Cases");
			System.out.println("========================================================");
			System.out.println("Case 1: Insertion");
			System.out.println("Case 2: Deletion");
			System.out.println("Case 3: Retrieval");
			System.out.println("Case 4: Exit");
			
			System.out.println("Enter the Choice");
			int choice = sc.nextInt();
			System.out.println("--------------------------------------------------------");
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter how many element push");
					int n = sc.nextInt();
					
					for(int i=0 ; i<n ; i++)
					{
						System.out.println("Enter the key");
						int key = sc.nextInt();
						System.out.println("Enter the value");
						int value = sc.nextInt();
						
						hashMap.put(key, value);
					}
					break;
					
				case 2:
					System.out.println("Enter the delete key");
					int val = sc.nextInt();
					hashMap.remove(val);
					break;
					
				case 3:
					System.out.println(hashMap);
					break;
					
				case 4:
					System.exit(0);
					break;
					
				default :
					System.out.println("Invalid Input");
			}
			
		}while(true);
	}
}
