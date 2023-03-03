package methodex;


// static 전역함수, 시스템이 시작할 때 부터 종료할 떄까지 사용 가능,,
public class MethodEx8 {
	public static void view1() {
		System.out.println("static method"); // = class method 
	}
	
	// 객체를 만들어야 사용가능 life-cycle 
	public void view2() {
		System.out.println("non-static method");
	}
	
	
	public static void main(String[] args) {
		//클래스 메서드(static method) : 객체 없이 호출 가능
		view1();
		MethodEx8.view1(); // 자기 자신의 메서드에 접근할때는 클래스이름 생략 가능
		
		// 인스턴스 메서드(instance method):
		// 반드시 객체를 생성한 후에 메서드를 호출 할 수 있음
		// 클래스 - 오브젝트(인스턴스)
		//자료형 변수명 =초기화();
		MethodEx8 method = new MethodEx8();
		method.view2();
		//method.view1();
	}
}
