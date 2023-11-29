package problems;
import java.util.Scanner;


public class star_Diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nStarDiamond(n);
	}
	
	public static void nStarDiamond(int n) {
		 for(int i=0;i<n;i++){
	            for(int k=0;k<n-(i+1);k++){
	                System.out.print(" ");
	            }            
	            for(int j=0;j<(2*i)+1;j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        for(int i=0;i<n;i++){
	            for(int k=0;k<i;k++){
	                System.out.print(" ");
	            }            
	            for(int j=0;j<(2*n)-((2*i)+1);j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	}
}
