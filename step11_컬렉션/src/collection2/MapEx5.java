package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx5 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("둘리", "객실4");
		map.put("또치", "객실1");
		map.put("마이콜", "객실3");
		map.put("도우너", "객실2");
		map.put("고길동", "객실5");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("방이름을 입력하세요 객실1~5 : ");
		String room = sc.next();
		
		Set<String> col = map.keySet();
//		System.out.println(col);
//		for(String key : col) {
//			String rooom = map.get(key);
//			if(rooom.equals(room))
//				System.out.println(room+"에 있는 사용자는 " + key + "입니다");
//		}
		List<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();
			String rooom = map.get(name);
			if(rooom.equals(room))
				System.out.println(room+"에 있는 사용자는 " + name + "입니다");
		}
	}
	

}
