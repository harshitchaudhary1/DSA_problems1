package problems;
import java.util.Scanner;
public class Count_digit_in_number {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a Digit");
			int n = sc.nextInt();
			
			int count=0;
			
			while(n!=0) {
				n=n/10;
				++count;
			}
			System.out.println(count);
		}
	}
}