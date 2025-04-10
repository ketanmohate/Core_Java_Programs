package Constructor.org;

import java.util.*;

public class Q1_All_Constructors{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Default Capacity 
		Vector vector1 = new Vector();
		System.out.println("Vector set with default Capacity...");
		System.out.println(vector1.capacity());
		
		System.out.println("-----------------------------------------------------------");
		
		// set InitialCapacity
		Vector vector2 = new Vector(20); 
		System.out.println("Vector set with initial Capacity...");
		System.out.println(vector2.capacity());
		
		System.out.println("-----------------------------------------------------------");
		
		// set initialCapacity and incrementalCapacity
		Vector vector3 = new Vector(2,100);
		System.out.println("Vector set with initial capacity and incremental capacity...");
		System.out.println("Initial Capacity:\t" + vector3.capacity());
		vector3.add(100);
		vector3.add(200);
		vector3.add(300);
		System.out.println("Size of vector... \t" + vector3.size());
		
		System.out.println("----------------------------------------------------------");
		
		// set collection as a vector
		Vector vector4 = new Vector(vector3);
		System.out.println("Vector set With a Other Collection...");
		System.out.println(vector4.capacity());
		System.out.println("Size of vector... \t" + vector4.size());
		
		System.out.println("----------------------------------------------------------");
	}

}
