package methodex;

//call by name: 이름만 있는 함수


// 프로그램을 실행한다는 의미는 main함수를 호출하는 것.


public class MethodEx1 {
	//함수 문법
	//접근지정자 static 리턴값의자료형 함수명(){} <== 함수정의
	//리턴값이 없는경우 void
	
	//public 외부에서 접근이 가능
	//private 외부에서 접근이 안됨
	//특정한 동작 단위로 구현하기 위해선 함수 필요
	public static String view(String a, int b) {
		System.out.println("hello"); // 함수 호출, 함수냅에서 함수호출가능
		return a; // 제어를 호출한곳으로 돌려줌, 리턴이 void인 경우 생략 가능
				// 자바스크립트에서 많이 사용
	}	
	public static void star() {
		System.out.println("*****");
	}
	
	//메인함수 main 함수 이름
	//		String[] args 매개변수 
	public static void main(String[] args) {
		String str = "문자";
		
		star();
		star();	
	}	
}
