package interfaceex;

//인터페이스
interface Shape {
	final int r = 10;
	public void draw();
	public void erase();
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("반지름이 " + "인 원을 그립니다.");
	}

	@Override
	public void erase() {
		System.out.println("원을 지웁니다.");
	}

}

public class InterfaceEx1 {

	public static void main(String[] args) {
		Circle cir = new Circle();
		cir.draw();
		cir.erase();
	}

}

////추상 클래스
//abstract class Shape {
//	final int r = 10;
//	public abstract void draw();
//	public abstract void erase();
//}
//
//class Circle extends Shape {
//	@Override
//	public void draw() {
//		System.out.println("반지름이 " + r + "인 원을 그립니다.");
//	}
//
//	@Override
//	public void erase() {
//		System.out.println("원을 지웁니다.");
//	}
//
//}
//
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir = new Circle();
//		cir.draw();
//		cir.erase();
//	}
//
//}

//
//
//
//
//
//// 일반 클래스
//class Shape{
//	final int r = 10;
//	public void draw() {
//		
//	}
//	
//	public void erase() {
//		
//	}
//}
//class Circle extends Shape{
//	@Override
//	public void draw() {
//		System.out.println("반지름이 "+r+"인 원을 그립니다.");
//	}
//	@Override
//	public void erase() {
//		System.out.println("원을 지웁니다.");
//	}
//	
//}
//
//public class InterfaceEx1 {
//	
//	public static void main(String[] args) {
//		Circle cir = new Circle();
//		cir.draw();
//		cir.erase();
//	}
//
//}
