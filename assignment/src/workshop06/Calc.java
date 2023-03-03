package workshop06;

public class Calc {
	
	int calculate(int data) {
		int sum =0;
		System.out.print("짝수 : ");
		for(int i=1; i<=data; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
				sum+=i;
			}
		}
		System.out.println();
		return sum;
	}
}
