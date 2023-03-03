package whileex;

public class WhileEx4 {

	public static void main(String[] args) {
		int a=0, sum=0, mul=1;
		while(a<10) {
			a++;
			sum+=a;
			mul*=a;
			System.out.println("sum = "+sum+"\t mul = "+mul);
		}
	}
}
