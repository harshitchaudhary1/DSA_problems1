package udemy_learning;

public class Multipliaction_Table {
	 void print() {
		for(int i =1;i<=10;i++) {
			System.out.printf("%d * %d = %d", 5, i,5*i);
			System.out.println();
		}	
	}
	 void print(int num) {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d =%d", num,i,num*i);
			System.out.println();

		}
	}
	 void print(int num,int from, int to) {
		for(int i=from;i<=to;i++) {
			System.out.printf("%d * %d =%d", num,i,num*i);
			System.out.println();
		
		}
	}
}
