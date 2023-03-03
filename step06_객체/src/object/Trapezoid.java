package object;

/*
	-base:int
	-top:int
	-height:int
	+setTrapezoid(base:int, top:int, height:int):void
	+calc():double 		<== 사디리골의 넓이를 구해서 리턴
	+toString():String	
*/
// 사다리꼴의 넓이 = (아랫변 + 윗변)* 높이 / 2 
public class Trapezoid {
	private int base;
	private int top;
	private int height;
	
	public void setTrapezoid(int base, int top, int height) {
		this.base = base;
		this.top = top;
		this.height = height;
	}
	public double calc() {
		return (double)((base+top)*height) / 2 ;
	}
	public String toString() {
		//return String.valueOf(calc()); 
		return "넓이 "+calc();
	}
}
