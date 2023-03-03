package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx3 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "피카츄");
		map.put(1, "잠만보");
		map.put(4, "파이리");
		map.put(2, "꼬부기");
		
		System.out.println(map);
		
		
		
		Set<Integer> keys = map.keySet();
		List<Integer> list = new ArrayList<>(keys);
		Collections.sort(list); // 정렬.
		
		for(Integer n : list)
			System.out.println(map.get(n));
		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(map.get(it.next()));
//		}
		
//		Set<Integer> keys = map.keySet();	// Set으로 map의 키값을 얻어와서
////		System.out.println(keys);
//		for(Integer n : keys) {
//			System.out.println(map.get(n));	// 향상된 for문으로 get으로 값을 꺼내온다.
//		}
		
		
		
		
		
		
		
		
		
	}
}
