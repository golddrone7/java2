package override;

class Test1{
	public void view1() {System.out.println("view1 method");}
	public void view3() {System.out.println("view3 method");}
}


class Test2 extends Test1{
	@Override // 어노테이션, 컴파일러에게 알려주는 Message, 부모클래스의 메서드와 단어 철자 맞는지.
			// 오버라이드 : 메서드 재정의
	public void view1() {System.out.println("view11 method");}
	public void view2() {System.out.println("view22 method");}
}

public class OverrideEx {

	public static void main(String[] args) {
		
		Test1 ob = new Test2(); // 부모클래스의 참조변수로 자식객체 생성 (별*10000 중요)
		ob.view1();
		ob.view3();
		//Test2 ob = new Test1(); // (X) 자식클래스의 참조변수로 부모객체 생성?? 말이 안됨
//		Test2 ob2 = new Test2();
//		Test1 ob =new Test1();
//		ob.view1();
//		ob.view3();
		
		
//		ob2.view1();
//		ob2.view2();
//		ob2.view3();

	}
}
