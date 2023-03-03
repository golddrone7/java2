package shape;

public class Triangle extends Shape {
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(int x, int y) {
		super(x,y);
	}
	
	
	@Override
	public double getSize() {
		return  (double)(getX() * getY())/2;
	}
}
