package org.revison;

import java.util.*;

public class VectorOperation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();

		do {
			System.out.println("=========================================");
			System.out.println("1:Add Element in collection");
			System.out.println("2:View All Data");
			System.out.println("3:Search Data");
			System.out.println("4:Find index and delete");
			System.out.println("5: count element ");
			System.out.println("6: Exit");
			System.out.println("=========================================");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			
			switch (choice) {
			case 1:
				System.out.println("enter the Add Element");
				int data = sc.nextInt();
				
				boolean b = 	v.add(data);
				if(b) {
					System.out.println("Data Added");
				}else {
					System.out.println("Data Not Added");
				}
				
				break;
				
			case 2:
				System.out.println("view All Data");
				Iterator i = v.iterator();
				
				while(i.hasNext()) {
					Object obj = i.next();
					System.out.println(obj);
				}
				break;
				
			case 3:
				System.out.println("Enter the Search Data");
				data = sc.nextInt();
				
				b = v.contains(data);
				
				if(b) {
					System.out.println("Data Found" + data);
				}else {
					System.out.println("Data Not Found" + data);
				}
				
				break;
				
			case 4:
				System.out.println("Enter the Delete Data");
				data = sc.nextInt();
				
				int a = v.indexOf(data);
				
				if(a!=-1) {
					System.out.println("Data Found" + data);
					v.remove(a);
					System.out.println("Data Deleded" + data);
				}else {
					System.out.println("Data Not Found");
				}
				break;
				
			case 5:
				System.out.println("Number of Element Is " + v.size());
				break;
				
			case 6:
				System.exit(0);
				break;
				
				default : 
					System.out.println("Invalid Inpute");
			}

		} while (true);

	}

}
