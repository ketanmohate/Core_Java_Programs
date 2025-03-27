package Day_07_01_2025;
/* Example */
import java.util.*;
public class Ass2janAreaApp{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of triangles: ");
		int n = sc.nextInt();
		int [][] triangles = new int[n][3];
		long [] area = new long[n];
		
		for(int i = 0; i < n; i++){
			System.out.println("\nEnter the triangles: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			triangles[i][0] = a;
			triangles[i][1] = b;
			triangles[i][2] = c;
			area[i] = computeAreaSquare(a , b, c);
		}
		
		for(int i = 0; i < n; i++){
			for(int j =  i + 1; j < n ; j++){
				if(area[i] > area[j]){
					long temparea = area[i];
					area[i] = area[j];
					area[j] = temparea;
					
					int []temp = triangles[i];
					triangles[i] = triangles[j];
					triangles[j] = temp;
				}
			}
		}
		for(int i = 0; i < n;i++){
			System.out.println(triangles[i][0] +" "+triangles[i][1] +" "+triangles[i][2]);
		}
 }
public static long computeAreaSquare(int a, int b, int c){
		long p =(a + b + c)/2L;
		return p * (p - a) * (p - b) * (p - c);
	}
}