package assignment8_230111;

public class CircleRound extends Circle {

	public CircleRound(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	public void compute() {
		 size = 2 * r * PI;
	}
	
	public void output() {
		System.out.println("원의둘레 : " + size);
	}
	
	
	
}
