package problems;
import java.util.Scanner;
public class pascal_triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		   for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if((i+j)%2==0){
	                    System.out.print("1");
	                }
	                
	                else{
	                    System.out.print("0");
	                }
	            }
	            System.out.println();
	        }
	}
}
