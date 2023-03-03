package assignment12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test55 {

	public static void main(String[] args) {
		Map<Integer, Harrypotter> hm = new HashMap<>();
		hm.put(101, new Harrypotter(101, "해리", "포터"));
		hm.put(102, new Harrypotter(102, "론", "위즐리"));
		hm.put(103, new Harrypotter(103, "헤르미온느", "그레인져"));
	
		Iterator<Integer> it = hm.keySet().iterator();
		System.out.println("key\tvalue");
		System.out.println("----------------------------");
		while(it.hasNext()) {
			int key = it.next();
			System.out.println(hm.get(key).toString());
		}
		
//		System.out.println("key\tvalue");
//		System.out.println("----------------------------");
//		System.out.println(hm.get(101).toString());
//		System.out.println(hm.get(102).toString());
//		System.out.println(hm.get(103).toString());
//		
	}
}
