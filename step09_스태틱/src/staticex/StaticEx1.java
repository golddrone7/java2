package staticex;


// 인스턴스 변수와 관련된 작업을 하는 메서드는 인스턴스 메서드
// static변수와 관련된 작업을 하는 메서드는 클래스 메서드, static 메서드
class Test{
	int x; // 객체 생성 이후 생성
	int y; 
	static int z; // 객체 생성 이전에 생성, 최초의 1번만 초기화.

	static {		// static 블록, 스프링에서 많이 사용
		z = 100;
		System.out.println("static 초기화 영역");
	}

	public Test() {
		System.out.println("객체 초기화 영역");
	}
	
	public Test(int x, int y, int z1) {
		this.x = x;
		this.y = y;
		z = z1;			// static 변수는 this. 을 사용하지 않음
		System.out.println("객체 초기화 영역");
	}
	public void view() {
		System.out.println(x+" " + y + " " + z);
	}
	
	
}

public class StaticEx1 {
	public static void main(String[] args) {
//		new Test().view();
		Test ob1 = new Test(1, 2, 3); // x, y는 초기화, z는 초기화 되지 않음
		
		Test ob2 = new Test(4, 5, 6);
		ob1.view();
		ob2.view();
	}
}
