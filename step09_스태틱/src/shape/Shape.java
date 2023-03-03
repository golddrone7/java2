package shape;

//protected 면 자손이 인스턴스 변수 접근이 가능
public class Shape {
	private int x;
	private int y;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double getSize() {
		return 1;
	}
}
