package workshop05;

abstract public class Shape {
	private int width;
	private int height;
	private String color;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public Shape(int width, int height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	abstract public double getArea(); // 넓이 구하기

	
}
