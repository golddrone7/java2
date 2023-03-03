package inheritance;
// 생성자 연습

class ParentEx{
	public ParentEx() {
		System.out.println("parent class"); //3
	}
}

class ChildEx extends ParentEx{
	
	public ChildEx() {
		//super(); 생략 2
		System.out.println("child class"); //4
	}
}


public class Inheritance3 {

	public static void main(String[] args) {
		ChildEx ch = new ChildEx(); // 1, 5 종료
	}
}

/*	
	this.변수				자기 자신 클래스
	this.method()
	this()
	this(인자, 인자, ...) --- 생성자(자기 자신)
	
	super.변수				자식 클래스 -> 부모 호출
	super.메서드()
	super(인자, 인자, ...) --- 생성자(부모)
*/
