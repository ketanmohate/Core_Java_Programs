package org.revison;
import java.util.*;

public class FetchDataInReverseDirection {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		
		ListIterator li =  v.listIterator(v.size());
		
		while(li.hasPrevious()) {
			Object obj = li.previous();
			System.out.println(obj);
		}
		
//		for(Object obj : v) {
//			System.out.println(obj);
//		}
		
	}

}
