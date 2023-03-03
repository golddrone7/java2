package methodex;

//call by name : 이름만 있는 함수
public class MethodEx2 {
	
	public static int view1() {
		return 10; // 2번 실행
	}
	
	public static char view2() {
		return 'H';
	}
	
	public static float view3() {
		return 50.3f;
	}
	
	public static double view4() {
		return 50.3;
	}
	
	public static String view5() {
		return "Hello";
	}
	
	public static boolean view6() {
		return true;
	}
	
	public static void main(String[] args) {
		int x /*3번 실행 */ = view1(); //1번 실행
		System.out.println(x); // 4번 실행
		char c = view2();
		System.out.println(c);
		float y = view3();
		System.out.println(y);
		System.out.println(view3());
		double d = view4();
		System.out.println(view4());
		System.out.println(view5());
		System.out.println(view6());
	}

}
