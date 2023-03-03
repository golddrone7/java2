package forex;

//for(초기값; 조건식; 증감식) {처리할내용}

public class ForEx1 {
	public static void main(String[] args) {
		// 문제.
		// 100 97 94... 82		
		System.out.println("for 문");
		
		for(int i=100; i>=82; i-=3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("While 문");
		
		int j=100;
		while(j>=82) {
			System.out.print(j + " ");
			j-=3;
		}
				
		// A B C ... Z		
//		for(char i='A'; i<='Z'; i++) {
//			System.out.print(i + " ");
//		}
		
//		int sum = 0; // 1~100까지의 합계
//		int odd = 0, even = 0;
//
//		for (int i = 0; i <= 100; i++) {
//			sum += i;
//			// 문제. 홀수합과 짝수합을 계산하세요 switch문 이용
//			switch (i % 2) {
//			case 0:
//				even+=i;   
//				break;
//			case 1:
//				odd+=i;
//				break;
//			}
//		}
//		System.out.println("1~100까지의 합계는 " + sum);
//		// 홀수합과 짝수합을 출력하세요
//		System.out.println("1~100까지의 홀수합 : " + odd);
//		System.out.println("1~100까지의 짝수합 : " + even);
	}
}
