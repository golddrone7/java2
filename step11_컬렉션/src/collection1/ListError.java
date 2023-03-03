package collection1;

import java.util.ArrayList;
import java.util.List;

//자료형의 변환 문제
public class ListError {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(Integer.valueOf(10));
		list.add("겨울");
		list.add(40.0f);
		list.add(5);
		
		for(int i=0; i<list.size(); i++) {
			String season = (String)list.get(i);	// 소스코드 상으론 문제 없지만 자료형이 맞지 않아 Error 발생,,,
			System.out.println(season);
		}
		
		
	}
}
