package tech.org;

public class P_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0; 
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= i && j <= 5) {
					System.out.print(j + " ");
				}
				else if (j <= i * 2 - 1) {
					System.out.print(count-- + " ");
				} else {
					System.out.print("  ");
				}
			}
			count=count+i;
			System.out.println();
		}

	}

}
