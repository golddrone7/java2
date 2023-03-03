package workshop07;

public class ExTest {

	public static void main(String[] args) throws InvalidException {
		try {
		int num = Integer.parseInt(args[0]);
		if(num<2 || num>5) {
			throw new InvalidException();
		}
		Calc c = new Calc();
		double sum = c.getSum(num);
		System.out.println("결과 값 : " + sum );

		}catch(Exception e) {
		}
	}
}
