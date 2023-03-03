package workshop13;

import java.util.ArrayList;
import java.util.List;

public class ShipTest {

	public static void main(String[] args) {
		// ArrayList를 만들어 각각의 Boat 객체와 Cruise객체를 생성하여 넣는다
		List<Ship> list = new ArrayList<Ship>();
		list.add(new Boat("Boat01", 500));
		list.add(new Cruise("Cruse01", 1000));
		
		System.out.println("shipName\tfuelTank\r\n"
				+ "-----------------------------");
		// 생성된 객체의 정보 출력 - for문 사용
		for(int i=0; i<list.size(); i++) {
			Ship ship = list.get(i);
			System.out.println(ship.getShipName()+"\t\t"+ship.getFuelTank());
		}
		System.out.println();
		System.out.println("10 운항");
		System.out.println("shipName\tfuelTank\r\n"
				+ "-----------------------------");
		// 각각의 Ship 객체에 10 운항 후 객체 정보 출력 - for 문 사용
		for(int i=0; i<list.size(); i++) {
			Ship ship = list.get(i);
			ship.sail(10);
			System.out.println(ship.getShipName()+"\t\t"+ship.getFuelTank());
		}
		System.out.println();
		System.out.println("50 주유");
		System.out.println("shipName\tfuelTank\r\n"
				+ "-----------------------------");
		
		//각각의 Ship 객체에 50 주유 후 객체 정보 출력 – for문 사용
		for(int i=0; i<list.size(); i++) {
			Ship ship = list.get(i);
			ship.refuel(50);
			System.out.println(ship.getShipName()+"\t\t"+ship.getFuelTank());
		}
		
	}

}
