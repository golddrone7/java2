package assignment4_23_01_06;

/*
	[문제 26] 메서드를 호출해서 다음과 같이 출력하시오.
(1)main()의 코드(아래 코드외에 다른 코드는 추가하지 마세요)
    String result=personView("홍길동", 90,78,88);
    System.out.println(result);

(2) personView()메서드에서 총점을 계산한후 출력문장을 만들어 
     return 하시오

(3)결과화면 
홍길동의 총점은 256점입니다


*/
public class Problem26 {

	public static void main(String[] args) {
		 String result=personView("홍길동", 90,78,88);
		 System.out.println(result);
	}

	private static String personView(String string, int i, int j, int k) {
		return string + "의 총점은 "+ (i+j+k) + "점입니다";
	}

}
