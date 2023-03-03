package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List : 중복허용 o, 순서 유지 o, 인덱스를 사용
// 배열과 비슷, 담을수 있는 값의수가 자동으로 증가되는 컨테이너 (컬렉션즈 프레임웍) ! 배열은 기억공간이 확정되면 변경 불가, 
// 서로 다른 자료형의 연속된 기억공간, 제네릭으로 동일한 자료형 설정 할 수 있음


public class ListEx1 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(4);
		list.add(Integer.valueOf(4));
		list.add(new Float(5.0f));
		list.add("second");
		list.add(5.0f);
		
		System.out.println(list);
		
		list.iterator();
		
		for(int i=0; i<list.size(); i++) {	// List 자료구조는 .size()로 호출
			// size() 리스트에 있는 데이터의 개수를 리턴
			System.out.println(list.get(i));  // list.get(i)로 호출하기 꼭 기억하기
			// get(index) 인덱스에 해당하는 값을 리턴
		}
		for(int i=list.size(); i<1000000; i++) {
			list.add(i);
		}
		System.out.println("------------------------------");
		
//		list.remove("second"); 	// 첫번째 세컨드를 삭제하는 것, 하나의 값을 삭제
//							//객체로 삭제, 인덱스로 삭제 가능
//		list.remove(3); 	// 인덱스로 삭제
		double _start_=System.currentTimeMillis();
		for(Object x:list) {
			Object x1 = x;
		}
		System.out.println();
		double _end_=System.currentTimeMillis();
		System.out.println("향상된 for문의 소요시간 : " + (_end_ - _start_));
		
		
	
		Iterator it =  list.iterator();
		double start=System.currentTimeMillis();
		while(it.hasNext()) {
			Object y = it.next();
		}
	
		double end=System.currentTimeMillis();

		System.out.println();
		System.out.println("이터레이터 소요시간 : " + (end-start));
		
		double start_=System.currentTimeMillis();
		for(int i=0; i<list.size(); i++) {
			Object x = list.get(i);
		}
		double end_=System.currentTimeMillis();
		
		System.out.println("for문 소요시간 : " + (end_-start_));
	}

}
