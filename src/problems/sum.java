package problems;
import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n = sc.nextInt();
		System.out.println("Enter 2nd number");
		int n1 = sc.nextInt();
		
		System.out.print("Sum of n + n1 = ");
		System.out.println(n+n1);		
	}
}
