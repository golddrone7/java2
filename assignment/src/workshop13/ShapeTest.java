package workshop13;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<>();
		list.add(new Rectangle(4,7,5));
		list.add(new Rectangle(5,4,6));
		list.add(new Circle(6,6,7));
		list.add(new Circle(7,8,3));
		
		System.out.println("구분\t\t길이\tX좌표\tY좌표\tArea\tCircumference");
		
		Iterator<Shape> it = list.iterator();
		while(it.hasNext()) {
			Shape s = (Shape) it.next();
			if(s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				System.out.println("Rectangle\t"+r.getWidth()+"\t"+r.getPoint().getX()+"\t"+r.getPoint().getY()+"\t"+Math.round(r.getArea())+"\t"+Math.round(r.getCircumference()));
			} 
			if(s instanceof Circle) {
				Circle r = (Circle)s;
				System.out.println("Circle\t\t"+r.getRadius()+"\t"+r.getPoint().getX()+"\t"+r.getPoint().getY()+"\t"+Math.round(r.getArea())+"\t"+Math.round(r.getCircumference()));
			}
		}
		it = list.iterator();
		System.out.println("이동 후");
		while(it.hasNext()) {
			Shape s = (Shape) it.next();
			if(s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				r.move(10, 10);
				System.out.println("Rectangle\t"+r.getWidth()+"\t"+r.getPoint().getX()+"\t"+r.getPoint().getY());
			} 
			if(s instanceof Circle) {
				Circle r = (Circle)s;
				r.move(10, 10);
				System.out.println("Circle\t\t"+r.getRadius()+"\t"+r.getPoint().getX()+"\t"+r.getPoint().getY());
			}
		}
	
	}

}
