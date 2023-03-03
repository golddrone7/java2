package workshop06;

public class Problem02 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		Calc ca = new Calc();
		System.out.println("결과 : " + ca.calculate(num));
	}
}
