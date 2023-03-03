package finalex;

//상수화 final

class A{
	final int n = 100; // 변수 n이 상수
	final public void view(final String str) { // 변수의 값을 상수로 사용은 잘 안함.
//		n=200; // 100 = 200 잘못된 표현 --final 변수는 값을 변경할 수 없음
//		str = "가나다";
		System.out.println(str + " class");
	}
}

class B extends A{
	
//	@Override
//	public void view(final String str) {	// final 메서드는 오버라이드 불가
//		System.out.println("B 클래스");	// final은 쓸 일이 별로 없다
//	}
	
}





public class FinalTest {
	public static void main(String[] args) {
		new A().view("abc");
	}
}
