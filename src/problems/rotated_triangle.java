package problems;
import java.util.Scanner;

public class rotated_triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
//			for(int j=0;j<n-i-1;j++) {
//				System.out.print(" ");
//			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		for(int i=0;i<n;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(" ");
//			}
			for(int j=0;j<n-i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
