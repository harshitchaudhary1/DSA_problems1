package problems;
import java.util.Scanner;

public class prime_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		prime(n);
		
	}
	public static boolean prime(int n) {
		
		if(n<=1) {
			System.out.println(n + "is not a prime number");
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(n + " is not a prime number");
				return false;
			}
		}
		System.out.println(n + " is a prime number");
		return true;
		
	}
}
