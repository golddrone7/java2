package workshop07;

public class Calc {
	public double getSum(int data) {
		double sum=0;
		for(int i=1; i<=data; i++) {
			sum+=(double)i;
		}
		return sum;
	}
}

