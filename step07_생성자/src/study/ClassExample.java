package study;

class Car{
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	Car(){
	}
	
	Car(String model){
		this(model, "은색", 250);
	}
	Car(String model, String color){
		this(model, color, 250);
	}
	
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("study.Car");
			System.out.println(clazz2.getName());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
