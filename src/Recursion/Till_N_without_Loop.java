package Recursion;
import java.util.Scanner;

public class Till_N_without_Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int x = sc.nextInt();
		int[] arr = new int[x];
		
		PrintNTimes(x, arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}
	public static void PrintNTimes(int x , int[] arr) {
		if(x>=1) {
			arr[x-1]=x;
			PrintNTimes(x-1, arr);
			
		}
		
	}
}
