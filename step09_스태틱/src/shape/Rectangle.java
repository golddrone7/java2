package shape;

public class Rectangle extends Shape {
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getSize() {
		return  getX() * getY();
	}
}
