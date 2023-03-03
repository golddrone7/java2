package assignment8_230111;

public class Triangle extends Shape {

	public Triangle(int data1, int data2) {
		super(data1, data2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return getnDate1() * getnDate2() / 2.0;
	}

}
