package workshop13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Mobile> map = new HashMap<String, Mobile>();
		double sum = 0.0;
		// 4개의 Mobile 객체 생성
		Mobile mob1 = new Mobile("LU6800", "Optimus 2X", 800000);
		Mobile mob2 = new Mobile("SU6600", "Optimus Black", 900000);
		Mobile mob3 = new Mobile("KU5700", "Optimus Big", 700000);
		Mobile mob4 = new Mobile("SU7600", "Optimus Mach", 950000);
		// map에 4개의 객체를 code를 키 값으로 넣는다.
		map.put("LU6800", mob1);
		map.put("SU6600", mob2);
		map.put("KU5700", mob3);
		map.put("SU7600", mob4);
		
		Iterator it = map.keySet().iterator();
		
		// Mobile 정보를 출력 하고 합계를 계산
		for(int i=0; i<map.size(); i++){
			Mobile mobile = map.get(it.next());
			System.out.println(mobile.printInfo());
			sum = sum + mobile.getPrice();
		}
		System.out.println("합계 : " + sum);
		System.out.println();
		System.out.println("가격 변경 후");
		// Mobile 객체의 가격 정보를 10% 증가 시킨다.
		sum=0;
		it = map.keySet().iterator();
		for(int i=0; i<map.size(); i++){
			Mobile mobile = map.get(it.next());
			mobile.setPrice(mobile.getPrice()*1.1);
		}
		
		it = map.keySet().iterator();
		// 변경된 정보를 출력 하고 합계를 계산
		for(int i=0; i<map.size(); i++){
			Mobile mobile = map.get(it.next());
			System.out.println(mobile.printInfo());
			sum = sum + mobile.getPrice();
		}
		System.out.printf("합계 : %.1f" , sum);
	}
}
