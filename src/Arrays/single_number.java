package Arrays;
import java.util.Scanner;
public class single_number {
	public static int single(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					i++;
					break;
				}
				
				if(j==arr.length-1) {
					return arr[i];
				}
				
			}
			return arr[arr.length-1];	
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		single(arr);
	}
}
