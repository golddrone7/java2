package workshop13;

public class Rectangle extends Shape implements Movable{
	private int width;
	
	public Rectangle() {
	}

	public Rectangle(int width, int x, int y) {
		super(new Point(x,y));
		this.width = width;
	}
	
	@Override
	public void move(int x, int y) {
		Point p = getPoint();
		setPoint(new Point(x+p.getX()+2, y+p.getY()+2));
	}

	@Override
	public double getArea() {
		return width*width;
	}

	@Override
	public double getCircumference() {
		return 4*width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
	
}
