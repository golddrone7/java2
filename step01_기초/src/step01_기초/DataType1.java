package step01_기초;

/*	콘솔 : 표준 입출력 장치  
   표준입력장치 : 키보드
   표준출력장치 : 마우스
*/ 
public class DataType1 {
	public static void main(String[] args) {		
		String name="홍길동"; // 문자열은 "" 안에 작성
		int age = 24;	// 인트, 정수자료형 4바이트 
		char gender = '남';	// 캐릭털, 찰 하나의 문자는 ''안에 작성
		float weight = 63.5f; // 4바이트 실수자료형(float) 8바이트랑 구분하기 위해 f를 붙임
		double tall = 175.5; // 8바이트 실수자료형
		// 실무에선 float보다 double 사용		
//		System.out.println("이름 : 홍길동"); 
//		System.out.println("나이 : 23세");
//		System.out.println("성별 : 남"); 
//		System.out.println("체중 : 63.4kg");
//		System.out.println("신장 : 175.5cm");

		// CD-ROM, DVD __---__---
		System.out.println("이름 : "+name + "\n" + 
				"나이 : "+age+"세\n" +
				"성별 : "+gender +"\n" +
				"체중 : "+weight+"kg\n" +
				"신장 : "+tall+"cm");
		// 기본 중의 기본기 ( 아래 형식을 위로 바꾸는 연습이 필요!!!)
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+"세");
		System.out.println("성별 : "+gender);
		System.out.println("체중 : "+weight+"kg");
		System.out.println("신장 : "+tall+"cm");
	}
}
