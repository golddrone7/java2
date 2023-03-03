package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx4 {

	public static void main(String[] args) {
		Book bk1=new Book("java", "둘리", 300);
		Book bk2=new Book("jsp", "도우너", 200);
		Book bk3=new Book("oracle", "마이콜", 100);
		
		Map<String, Book> map = new HashMap<>();
		map.put(bk1.getTitle(), bk1);
		map.put(bk2.getTitle(), bk2);
		map.put(bk3.getTitle(), bk3);
//		System.out.println(map);

		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 도서명을 입력하세요 : ");
		String title=sc.next();
		if(map.get(title)==null) {
			System.out.println("찾을 도서가 없어요");
		}
		else {
			Book b = map.get(title);
			System.out.println("제목 : "+ b.getTitle() + 
					"\t저자 : "+b.getAuthor() + "\t페이지 : "+ b.getPage());
		}
		sc.close();
//		List<String> list = new ArrayList<>(map.keySet());
//		Collections.sort(list);
//		for(String s : list) {
//			Book b = map.get(s);
//			System.out.println("제목 : "+ b.getTitle() + 
//					"\t저자 : "+b.getAuthor() + "\t페이지 : "+ b.getPage());
//		}
//		
//		System.out.println();
//		
//		Set<String> set = map.keySet();
//		for(String s : set) {
//			Book b = map.get(s);
//			System.out.println("제목 : "+ b.getTitle() + 
//					"\t저자 : "+b.getAuthor() + "\t페이지 : "+ b.getPage());
//		}
//		
		
		
		
		
		
		
		
		
		
	}

}
