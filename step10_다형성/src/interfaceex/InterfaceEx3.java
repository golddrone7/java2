package interfaceex;

/* 클래스에서 interface를 상속 받을때는 implements
   인터페이스 간의 상속은 extends
*/
interface InterA{	// 인터페이스는 구현이라고 표현, 인터페이스간엔 다중 상속 가능 Why? 구현이 없기 때문,,
	
}
interface InterB{
	
}
interface InterC extends InterA, InterB{	// implement 사용 X
	
}



public class InterfaceEx3 {
	public static void main(String[] args) {
		
	}
}
