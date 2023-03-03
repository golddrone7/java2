package step02_연산자;

// ctrl+shift +f (전체 드래그한 상태 ) 자동 정렬
// 코드 개행 정리는 상위, 하위 개념
public class ParseInt {
	public static void main(String[] args) {
		String a = "100"; // 문자열 100
		String b = "200"; // 자바의 장점은 모호함을 해결해준다. 전자정부프레임워크에선 자바를 사용한다.
		int a1 = Integer.parseInt(a); // Integer 클래스, parseInt 함수 | 클래스가 가지고 있는 함수
		int b1 = Integer.parseInt(b); // "200" --> 200으로 변환
		
		// .을 해석하는 2가지 방식
		// 1. 입력	ㅁ().ㅁ() 출력 값의 결과를 다음 값의 입력으로 사용할 때
		//			어떤 함수의 실행 결과가 다음 함수의 입력으로 사용되는 경우
		// 2. 포함	Integer 클래스가 가지고 있는 parseInt 함수 A has B Integer.parseInt(a);
		//			클래스 또는 객체가 가지고 있는 함수
		System.out.println(a+b);	// 100200 연결하기
		System.out.println(a1+b1); 	// 300 더하기
		float x = Float.parseFloat(b);	//	"200" --> 200.0
		double y = Double.parseDouble(b);	//	"200" --> 200.0
		System.out.println(x+y);
		// 키보드, 파일
	}
}
