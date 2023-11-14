package problems;
import java.util.Scanner;

public class Reverse_a {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		 while(n>0) {
			 int digit = n%10;
			 n=n/10;
			 System.out.println(digit);
		 }
		
	}
}
