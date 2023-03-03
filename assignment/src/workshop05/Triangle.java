package workshop05;

public class Triangle extends Shape implements Resize {

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height, String color) {
		super(width, height, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setResize(int size) {
		setHeight(getHeight() + size);
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight() / 2.0;
	}

}
