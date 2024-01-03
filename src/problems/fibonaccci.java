package problems;

public class fibonaccci {
	public static void main(String[] args) {
		int a=0,b=1,n,count=10;
		System.out.println(a+" "+b);
		for(int i=2;i<count;++i) {		
			n=a+b;
			System.out.println(" "+n);
			a=b;
			b=n;
		}
	}

}
