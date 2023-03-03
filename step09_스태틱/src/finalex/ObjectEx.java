package finalex;


//자바에서 생략 가능한 것들
import java.lang.Object;
import java.lang.System;
import java.lang.String;

class Test{
	String name="둘리";
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public void view() {
		System.out.println("이름 : " + this.name.toString()); // this, toString() 생략 가능
	}
	
}

public class ObjectEx {

	public static void main(String[] args) {
		Test ob = new Test();
		ob.view();
	}

}
