package problems;

import java.util.Scanner;

public class Sum_of_Even_digit_andodd_digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int evencount = 0;
		int oddcount =0;
		
		while(n!=0) {
			int rem = n%10;

		if(rem%2==0) {
			evencount += rem;
		}
		else {
			oddcount += rem;
		}
		n=n/10;

		}
		
		System.out.println(evencount+" "+oddcount);
	}
}
