package workshop12;

public class CalcTest {

	public static void main(String[] args) {
		
		if(args.length<3 || args.length>3) {
			System.out.println("다시 입력 하세요");
			System.exit(0);
		}
		Calculator cal = new Calculator();
		
		int a = Integer.parseInt(args[0]);
		String c = args[1];
		int b = Integer.parseInt(args[2]);
		double result;
		
		if(c.equals("+"))
			result = cal.plus(a, b);
		else if(c.equals("-"))
			result = cal.minus(a, b);
		else if(c.equals("x"))
			result = cal.multiplication(a, b);
		else
			result = cal.divide(a, b);
		
		System.out.println("결과: " + result);
	}
}
