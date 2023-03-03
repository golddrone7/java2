package whileex;

// while(조건식){조건이 참값일동안 동작할 내용}

public class WhileEx1 {
	public static void main(String[] args) {
		// 10 9 8 7 6 5 4 3 2 1 
		int i = 10;
		while(i>0) {
			System.out.print(i+ " ");
			i--;
		}
		System.out.println();
		
//		int n=0;		
//		System.out.println(Integer.toBinaryString(-2147483333));
//		while(n<5) {
//			++n; // 증감식
//			System.out.println("hello java");
//		}
//		byte a=127;         
//		System.out.println(++a); // 오버플로우 -128~+127 값을 증가시키면 순환함.
//		int n=0;
//		// while 키워드
//		while(true) { //무한루프
//			++n;			// 오버플로우가 발생하기 때문에 출력됨. -2148.....~214.....7
//			if(n<=5) {
//				System.out.println("hello java");
//			} 
//		}	
	}
}
