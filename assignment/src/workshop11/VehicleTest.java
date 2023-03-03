package workshop11;

public class VehicleTest {
	public static void main(String[] args) {
		Truck car = new Truck(1000, 100, 5);
		
		
		
		System.out.println("최대적재중량\t오일탱크크기\t잔여오일량\t\t현재적재중량\t연비");
		System.out.println("=====================================================================");
		System.out.println(car.toString());
		
		System.out.println();
		car.addOil(50);
		System.out.println("50L 주유 후");
		System.out.println(car.toString());
		
		System.out.println();
		car.moving(50);
		System.out.println("50km 주행 후");
		System.out.println(car.toString());
		
		System.out.println();
		car.addWeight(100);
		car.getEfficiency();
		System.out.println("100km 적재 후");
		System.out.println(car.toString());
		
		System.out.println();
		car.moving(30);
		System.out.println("30km 주행 후");
		System.out.println(car.toString());
		
		System.out.println();
		System.out.println("요금 : " + car.getCost(30) +"원");
		
	}
}
