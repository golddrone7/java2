package workshop13;

public class Circle extends Shape implements Movable{
	private int radius;
	
	public Circle() {
	}

	
	
	public Circle(int radius, int x, int y) {
		super(new Point(x,y));
		this.radius = radius;
	}



	@Override
	public void move(int x, int y) {
		Point p = getPoint();
		setPoint(new Point(p.getX()+x+1,p.getY()+y+1));
	}

	@Override
	public double getArea() {
		return radius*radius*3.14;
	}

	@Override
	public double getCircumference() {
		return 2*3.14*radius;
	}



	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
