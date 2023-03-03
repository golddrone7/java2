package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set 중복허용 x, 순서유지 x
// 입력한 값들 중에서 고유한 값 하나만 저장하는 특성을 가지는 Collection

// 하나의 기억공간 안에 어떤 객체가 들어오게 됨, 2 Integer, Set, HashSet
// new는 객체 생성 연산자

public class SetEx {
	
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add("one");	// 자료형은 참조자료형
		set.add(2); // 2 --> Integer.valueOf(2) 바뀌는 과정을 박싱, Wrapper Class
		set.add(Integer.valueOf(3));
		set.add(new Integer(4)); // deprecated  없앤다는 코드
		set.add(new Float(3)); // 실수값으로 3을 저장
		set.add(4.00);	// double --> Double.valueOf(4.00) (boxing)	
		
		System.out.println(set);	// 250/11
		
		Iterator iter = set.iterator();
		//set의 값을 가지는 iterator 데이터 타입인 인스턴스 iter
		while(iter.hasNext())	// 다음 값이 있는가?
			System.out.print(iter.next() + " "); // next() 한번 접근하면 다시 접근할 수 없음.
//		System.out.println(iter.next()); // 데이터가 존재 하지 않아 NoSuchElementException 발생.
		
		System.out.println();
		if(set.contains("one")) {	// "one"이 포함되었는가? true/false
			System.out.println("데이터가 있습니다.");
		} else
			System.out.println("데이터가 없어요");
		
		
		System.out.println("set의 크기 : " + set.size());
		
		// falkhausen.de
	}

}
