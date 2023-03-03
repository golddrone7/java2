package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//제네릭스 : List안에 들어오는 데이터의 자료형,,
public class ListEx2 {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();   // ArrayList<String>은 생략가능, 앞에 명시하면 추정한다고
		// Object는 모든 클래스의 super class
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(Integer.valueOf(10));
		list.add("겨울");
		list.add(40.0f);
		list.add(5);
		
//		for(Object ob : list) {
//			System.out.println(ob);
//		}
		
		
		
//		Iterator<Object> iter = list.iterator();
//		
//		while(iter.hasNext())
//			System.out.print(iter.next()+ " ");
//		System.out.println();
//		
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		
		
	}

}
