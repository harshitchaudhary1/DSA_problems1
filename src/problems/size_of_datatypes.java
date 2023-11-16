package problems;

import java.util.Scanner;

public class size_of_datatypes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1-6\n" + "For Integer press 1\n" + "For Byte press 2\n"
				+ "For Float press 3\n" + "For Double press 4\n" + "For Short press 5\n"+"For Long press 6\n");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1 : {
			System.out.println(Integer.SIZE);
			break;
		}
		
		case 2 :{
			System.out.println(Byte.SIZE);
			break;
		}
		
		case 3 : {
			System.out.println(Float.SIZE);
			break;
		}
		
		case 4 : {
			System.out.println(Double.SIZE);
			break;
		}
		
		case 5 : {
			System.out.println(Short.SIZE);
			break;
		}
		
		case 6 : {
			System.out.println(Long.SIZE);
			break;
		}
		
		default : {
			System.out.println("Not a valid number");
			break;
		}
		
		}
		
	}
}
