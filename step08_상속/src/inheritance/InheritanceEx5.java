package inheritance;


class NumberEx1{
	int a, b;
	public NumberEx1() {
		
	}
	public NumberEx1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void view1() {
		System.out.println(a + "  " + b);
	}
}

class NumberEx2 extends NumberEx1{
	int c;
	public NumberEx2(int a, int b, int c) { 
		super(a,b);
		this.c = c;
	}
	
	public void view2() {
		super.view1();
		System.out.println(c);
	}
	
}


public class InheritanceEx5 {

	public static void main(String[] args) {
//		NumberEx1 ne = new NumberEx1(100,200);
//		ne.view1();
		new NumberEx1(100, 200).view1();
		new NumberEx2(100, 200, 300).view2();
//		NumberEx2 ne = new NumberEx2(100, 200, 300);
//		ne.view2();
	}
}
