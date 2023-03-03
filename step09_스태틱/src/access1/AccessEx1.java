package access1;

import access2.*;

// 접근지정자 public > protected > default(생략) > private

public class AccessEx1 extends AccessEx4 {
	private int x=10;
	private int y=20;
	public static void main(String[] args) {
		AccessEx1 ac1 = new AccessEx1();
		AccessEx2 ac2 = new AccessEx2();
		AccessEx3 ac3 = new AccessEx3();
		AccessEx4 ac4 = new AccessEx4();
		
		System.out.println(ac1.x + " " + ac1.y);
		System.out.println(ac2.x + " " + ac2.y);
		System.out.println(ac3.x + " " + ac3.y);
//		System.out.println(ac4.a + " " + ac4.b);
		// 자기 패키지안에서만 사용 가능한 protected 접근 지정자.
		System.out.println(ac1.a + " " + ac1.b);	
		// 단, 상속관계론 protected 접근 지정 가능.
		// ac1 참조변수로 다른 패키지 protected 맴버 변수 접근
	}

}
