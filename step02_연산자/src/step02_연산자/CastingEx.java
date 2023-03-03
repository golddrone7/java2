package step02_연산자;

// casting : 자료형의 변환
public class CastingEx {
	public static void main(String[] args) {		
		int pay = 857650;
		double tax = 0.033; // 3.3%
		int rPay = pay - (int) (pay * tax);
		// System.out.println(String.format("실수령액 : %d", rPay)); 구식 버전
		System.out.printf("실 수령액 : %d", rPay);
		// 연산자의 우선순위
		// A = B 같다(대입 연산)
		// A == B 같은가?
		// +5, -5 부호연산 가장 높음
		// = 대입연산 가장 낮음
		// 애매한 것들은 () 묶어두면 되기 때문에 의미없음

		// 좌변은 항상 기억공간(변수, 객체)이 와야함
		// 우변은 값 또는 변수가 와야함
		// ex) int a = 7, int a = new Integer(8);
		// 변수를 상수화(final) : 넘어오는 값이 불변이어야 할 경우
//		int k = 95, e=85, m=73;
//		int tot = k+e+m;
//		double avg=tot/3;
//		double avg = tot/3.0;  // 자동 형변환   
//		double avg = (double)tot/3; // 강제 형변환
//		
//		System.out.println("총점 : " + tot); // 253
//		System.out.println("평균 : " + avg); // 84.333333333333
//		System.out.println(String.format("평균 : %.1f", avg)); // String.format 은 System.out.printf(); 같은 방식으로 사용		
//		byte a = 100; 	// -128~127		-2^8~2^8-1
//		int b = a; // 자동 형변환 	작은 데이터에서 큰데이터로 변환할땐 자동 형변환이 일어난다.
//		double c = 73.45;	// 8byte 실수자료형
//		int d = (int)c; // 강제 형변환
//		
//		System.out.println(a+"\t"+b);
//		System.out.println(c+"\t"+d);
//		//~ 틸드
//				
	}
}
