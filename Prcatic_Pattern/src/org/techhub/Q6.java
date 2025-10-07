package org.techhub;
public class Q6 {
	public static void main(String[] args) {
		for(int i=1 ; i<=6 ; i++) {
			boolean flag = true;
			for(int j=1 ; j<=11 ; j++) {
				if(j>=7-i && j<=5+i && flag==true) {
					flag = false;
					System.out.print("* ");
				}else {
					flag = true;
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}