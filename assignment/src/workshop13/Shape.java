package workshop13;

public abstract class Shape {
	protected Point point;
	
	public Shape() {
	}

	public Shape(Point point) {
		super();
		this.point = point;
	}
	
	public abstract double getArea();			//도형의 넓이
	public abstract double getCircumference();	//도형의 둘레

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	
	
}
