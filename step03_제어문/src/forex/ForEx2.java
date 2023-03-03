package forex;

public class ForEx2 {
	public static void main(String[] args) {
//		int[] num= {11,22,33,44,55};
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
//		for(int i=num.length-1; i>=0; i--) {
//			System.out.println(num[i]);
//		}
		//향상된 for문 -- foreach(다른 언어)
		//향상된 for문은 역순 불가?
//		for(int x:num) {
//			System.out.println(x);
//		}
//		
		String[] color = {"red", "green", "blue"};

//		for(int n=0; n<1; n++) { // color.length ==>3
//			System.out.println(color[n]);
//		}
//		
		//문제. color를 향상된 for문으로 이용하여 출력하세요
		//향상된 for문은 전체부터 끝까지 출력
		//강남구역에 있는 ~~~를 100명만 출력해라
		
//		for(String str : color) {
//			System.out.println(str);
//		}
		// continue, break----------------
		for(int a=1; a<=10; a++) {
			if(a==5)
				continue; // 현재 동작을 멈추고 다시 시작
				// 1 2 3 4 6 7 8 9 10
//				break; // 1 2 3 4 끝나버림
			System.out.print(a + " ");			
		}
//		for(int i:num) {
//			System.out.println(i);
//		}
//		System.out.println(num); // 배열 객체의 참조주소를 리턴
	}
}
