package shape;

public class ShapeMain {
	public static void main(String[] args) {
		Shape sp = new Rectangle(10, 3);
		System.out.println("사각형의 넓이 " + sp.getSize());
		sp = new Triangle(7, 3);
		System.out.println("삼각형의 넓이 " + sp.getSize());
		
//		Rectangle rt = new Rectangle(10, 3);
//		System.out.println("사각형의 넓이 "+rt.getSize());
//		
//		Triangle tr = new Triangle(7, 3);
//		System.out.println("삼각형의 넓이 " + tr.getSize());
	}
}
