package problems;
import java.util.Scanner;

public class inverted_star_pyramid {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			// Star pyramind pattern 
			for(int i=0;i<n;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<2*n-(2*i+1);j++) {
					System.out.print("*");
				}
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
