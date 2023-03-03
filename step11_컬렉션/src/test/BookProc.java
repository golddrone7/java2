package test;

import java.util.ArrayList;

public class BookProc {

	public ArrayList<Book> getList() {
		ArrayList<Book> list = null; // 조건 검사가 필요하면 null 설정,,
								
		Book bk1 = new Book("java", "둘리", 300);
		Book bk2 = new Book("jsp", "도우너", 200);
		Book bk3 = new Book("oracle", "마이콜", 100);
		/*
		 * list에 bk1, bk2, bk3를 저장하고 리턴하세요
		 */
		list = new ArrayList<>();
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		return list;
	}

}
