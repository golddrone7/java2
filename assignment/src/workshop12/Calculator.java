package workshop12;

public class Calculator {
	public double plus(int a, int b) {
		return a+b;
	}
	
	public double minus(int a, int b) {
		return a-b;
	}
	
	public double multiplication(int a, int b) {
		return a*b;
	}
	
	public double divide(int a, int b) {
		try {
			return a/b;
		} catch(ArithmeticException e){
			System.out.println("Exception이 발생 하였습니다. 다시 입력해 주세요");
			return 0.0;
		}
	}
}
