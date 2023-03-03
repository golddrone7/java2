package step01_기초;

/*
	+기호의 의미
	1. 더하기
	2. 연결하기	System.out.println("hello\n"+"java");
	3. 단항 연산자 (부호, ++)
*/

public class SumTest {
	public static void main(String[] args) {
		int a=5, b=7;	// int 인트 integer 
		System.out.println("a는 " + a + ", b는 " + b);
		//System.out.println("a는 5, b는 7");
		System.out.println("a는 "+a+", b는 "+ b ); // 문자열, +는 연결의 의미를 갖음
		// 서로 다른 자료형일때 +는 연결의 의미를 갖음
		System.out.println(a+b); // 더하기
		// 추가로 넣을 때 편리하기 위해선 다음과 같이 진행 "" ++ 변수 삽입
		//System.out.println("a+b=12");
		System.out.println("a+b="+a+b); // 연결의 의미
		System.out.println("a+b="+(a+b)); // 계산의 의미
		System.out.println(a+"+"+b+"="+(a+b)); 	
		System.out.println(a+"+"+b+"="+(a+b));
	}
}
