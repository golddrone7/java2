package workshop10;

public class Test01 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if(!(5<=num && num<=10)) {
			System.out.println("다시 입력하세요");
			System.exit(0);
		}
		Calc cal = new Calc();
		System.out.println("결과 : " + cal.calculate(num));
	}
}
