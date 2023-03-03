package collection2;

import java.util.HashMap;
import java.util.Map;


// Map : 키 밸류 형식의 저장 방식을 가지는 컨테이너
// iterator 기능이 없음


//값을 저장할땐 map.put(key, Value)
//값을 꺼내올땐 map.get(key) --> value

//웹 사이트에서 DB 조회할 때, (로또 번호 1000회차)
//{1000 : {1,2,3,4,5,6}}    1000 Key, {1,2,3,4,5,6} Value
public class MapEx1 {
	
	public static void main(String[] args) {
		Book bk1 = new Book("이것이 자바다", "남궁성", 100);
		Book bk2 = new Book("이것이 자바다", "둘리", 200);
		Book bk3 = new Book("이것이 자바다", "마이콜", 300);
		Book bk4 = new Book("이것이 자바다", "마린", 400);
		Book bk5 = new Book("이것이 자바다", "남궁성", 500);
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "둘리");		// put() map에 데이터를 추가하는 함수
		map.put(201, "도우너");
//		map.put(101, "마이콜");  // 키가 중복이 된다면 나중에 오게 된 것
		map.put(301, "마이콜");
		map.put(401, "또치");
		
		System.out.println("Key : " + 101 + " value : " + map.get(101));
		System.out.println("Key : " + 201 + " value : " + map.get(201));
		System.out.println("Key : " + 301 + " value : " + map.get(301));
		System.out.println("Key : " + 401 + " value : " + map.get(401));
		System.out.println("Key : " + 501 + " value : " + map.get(501));
		
		//get(key) : 밸루를 리턴, 값이 없으면 null을 리턴
		map.remove(301);
		System.out.println("Key : " + 301 + " value : " + map.get(301));
		map.clear();
		System.out.println(map.get(101));
//		System.out.println("Key : " + 101 + " value : " + map.get(101));
//		System.out.println("Key : " + 201 + " value : " + map.get(201));
//		System.out.println("Key : " + 301 + " value : " + map.get(301));
//		System.out.println("Key : " + 401 + " value : " + map.get(401));
//		System.out.println("Key : " + 501 + " value : " + map.get(501));
//		map.put(1, bk1);
//		map.put(2, bk2);
//		map.put(3, bk3);
//		map.put(4, bk4);
//		map.put(5, bk5);
		
		
		
	
		
		
	}

}
