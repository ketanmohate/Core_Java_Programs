package Day_11_03_2025;

/*
 Q6. Frequency Count Using HashMap
Write a program that takes an array of integers and counts the frequency of each element using a HashMap.
 */

import java.util.*;

public class Q6_FrequencyCountUsingHashMap 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array lenght");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter values in array");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		Map <Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0 ; i<arr.length ; i++) 
		{
			Integer count = map.get(arr[i]);
			
			if(count == null)
			{
//				count = new Integer(0);
				count = 0;
			}
			++count;
			map.put(arr[i], count);
		}
		System.out.println("");
		
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		
		for(Map.Entry<Integer, Integer> m : set)
		{
			System.out.println(m.getKey() + "\t" + m.getValue());
		}
	}
}
