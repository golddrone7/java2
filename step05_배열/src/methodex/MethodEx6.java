package methodex;

public class MethodEx6 {
	/* 입사총점 : 815점
	   입사결과 : 합격 ==>총점이 800이상이면 합격, 미만이면 불합격
	*/
	public static int total(int a, int b) {
		return a+b;
	}
	public static String rs(int a) {
		return a>=800 ? "합격" : "불합격";
	}
	
	
	public static void main(String[] args) {
		int toeic=750, it=65;
		System.out.println("입사총점 : " + total(toeic, it));
		System.out.println("입사결과 : " + rs(total(toeic, it)));
	}
}
