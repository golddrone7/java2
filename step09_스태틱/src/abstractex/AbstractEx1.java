package abstractex;

//abstract class(미완성 클래스)
//abstract 메서드가 없어도 abstract 클래스는 만들 수 있음
abstract class A{
	public void view1() {System.out.println("view1");}
	public void view2() {System.out.println("view2");}
}
class B extends A{
	@Override
	public void view1() {System.out.println("view11");}
	//A클래스의 view1()을 재정의(오버라이드) --- 강제성이 없음
}

public class AbstractEx1 {
	public static void main(String[] args) {
		
		 A ob2 = new B(); // 부모 클래스 A의 참조변수 ob로 객체 B를 생성한다.		
		 ob2.view1();
		 ob2.view2();
		 
//		 A ob1 = new A(); // 객체 생성 불가능, 미완성 클래스 = 바퀴가 하나없이 실체화는 못함....
//		 ob1.view1();
//		 ob1.view2();
	}
}


//abstract class(미완성 클래스)

//함수는 정의가 되어야 사용가능
//abstract class A{
//	abstract public void view1();
//	public void view2() {System.out.println("view2");}
//}
//
//class B extends A{
//	@Override
//	public void view1() {System.out.println("view11");}
//	//A클래스의 view1()을 재정의(오버라이드) --- 강제성이 있음 -> abstract보단 interface를 많이 사용.
//	
//}
//
//
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//		
//		 A ob2 = new B(); // 부모 클래스 A의 참조변수 ob로 객체 B를 생성한다.		
//		 ob2.view1();
//		 ob2.view2();
//		 
////		 A ob1 = new A(); // 객체 생성 불가능, 미완성 클래스 = 바퀴가 하나없이 실체화는 못함....
////		 ob1.view1();
////		 ob1.view2();
//	}
//
//}

//일반 클래스
//class A{
//	public void view1() { System.out.println("view1");}
//	public void view2() {System.out.println("view2");}
//}
//
//class B extends A{
//	@Override
//	public void view1() {System.out.println("view11");}
//	//A클래스의 view1()을 재정의(오버라이드) --- 강제성이 없음
//	
//}
//
//
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//		 A ob1 = new A(); // 객체 생성 가능
//		 ob1.view1();
//		 ob1.view2();
//		 
//		 A ob2 = new B();
//		 ob2.view1();
//		 ob2.view2();
//	}
//}
