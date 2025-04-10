package Operation.org;

/*
 * Example: WAP to perform following operation on Vector class
_____________________________________________________________
Case 1: Add New Element in Vector 
Case 2: View All elements of Vector
Case 3: Search element of Vector using contains() method 
Case 4: Search element of Vector using indexOf() method?
Case 5: Fetch data of Vector between two specified indexes.
Case 6: count the total number of element from vector 
Case 7: check vector is empty or not 
Case 8: Search data of Vector using get() method 
 */

import java.util.*;

public class Q1_Vector_Oprations
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> vec = new Vector<Integer>();
		
		do {
			
			System.out.println("==============================================================");
			System.out.println("Oprations");
			System.out.println("==============================================================");
			System.out.println("Case 1: Add New Element in Vector ");
			System.out.println("Case 2: View All elements of Vector ");
			System.out.println("Case 3: Search element of Vector using contains() method ");
			System.out.println("Case 4: Search element of Vector using indexOf() method? ");
			System.out.println("Case 5: Fetch data of Vector between two specified indexes. ");
			System.out.println("Case 6: count the total number of element from vector ");
			System.out.println("Case 7: check vector is empty or not ");
			System.out.println("Case 8: Search data of Vector using get() method ");
			System.out.println("================================================================");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter how many element you want to add");
					int nEle = sc.nextInt();
					
					
					for(int i=1; i<=nEle ; i++)
					{
						System.out.println("Enter the Element");
						int element = sc.nextInt();
						vec.add(element);
					}
					break;
					
				case 2:
					System.out.println("====================================================");
					System.out.println("All Element In Vector");
					System.out.println("====================================================");
					
					Iterator<Integer> i = vec.iterator();
					
					while(i.hasNext())
					{
						Object obj = i.next();
						System.out.println(obj);
					}
					System.out.println("====================================================");
					break;
					
				case 3:
					System.out.println("Enter Search Element");
					int searchElement = sc.nextInt();
					
					if(vec.contains(searchElement))
					{
						System.out.println("Element Foun:\t" + searchElement);
					}
					else {
						System.out.println("Element not found");
					}
					
					break;
					
				case 4:
					System.out.println("Enter Search Element");
					searchElement = sc.nextInt();
					
					int index = vec.indexOf(searchElement);
					
					if(index != -1)
					{
						System.out.println("Element found at " + index + "Position");
					}
					else {
						System.out.println("Element not found");
					}
					
					break;
					
				case 5:
					System.out.println("Enter your Starting index");
					int startIndex = sc.nextInt();
					int endIndex = sc.nextInt();
					
					try {
						if(startIndex>=0 && endIndex<=vec.size()) 
						{
							List list = vec.subList(startIndex,endIndex); 
							
							Iterator ite = list.iterator();
							
							while(ite.hasNext())
							{
								Object obj = ite.next();
								
								System.out.println(obj);
							}
						}
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					break;
					
				case 6:
					
					System.out.println("Total Number Of Element In Vector");
					System.out.println(vec.size());
					
					break;
					
				case 7:
					
					if(vec.isEmpty())
					{
						System.out.println("Vector Is Empty");
					}
					else
					{
						System.out.println("Vector Contain some elements");
					}
					
					break;
					
				case 8:
				
					try {
						System.out.println("Enter index");
						index=sc.nextInt();
						
						Object obj = vec.get(index);
						System.out.println(obj);
					}
					catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Error is "+e.getMessage());
					}
						
					break;
					
				case 9:
					System.out.println("Exit...");
					System.exit(choice);
					break;
					
				default:
					System.out.println("Invalid choice...!");
			}
			
		}while(true);
		
	}
}
