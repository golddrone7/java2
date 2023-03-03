package assignment8_230111;

/*
(1)클래스명: Circle
   #r:int        
   #size :double        ==> 계산된 결괏값을 저장하는 변수
   #PI:double            ==> 초기값 3.141592, final
   +Circle(r:int)         ==> 반지름 대입
   +compute():void       
   +output():void 

*/
public class Circle {
	protected int r;
	protected double size;
	protected static final double PI = 3.141592;
	public Circle(int r) {
		this.r = r;
	}
	public void compute() {}
	public void output() {}
}
