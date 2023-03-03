package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		Book bk1=new Book("java", "둘리", 300);
		Book bk2=new Book("jsp", "도우너", 200);
		Book bk3=new Book("oracle", "마이콜", 100);
		Book bk4=new Book("Java Script", "good", 120);
		
		
		
		List<Book> list2 = new ArrayList<>();
		
		list2.add(bk1);
		list2.add(bk2);
		list2.add(bk3);
		list2.add(bk4);
		
//		for(Book b : list2) {
//		System.out.println("책이름 : " + b.getTitle()+"\t책저자 : " + b.getAuthor() +"\t페이지 : "+ b.getPage());
//	}
		
		
		Iterator<Book> it = list2.iterator();
		while(it.hasNext()) {
			Book b = it.next();	// iterator는 객체에 담아서 처리
			System.out.println("책이름 : " + b.getTitle()+"\t책저자 : " + b.getAuthor() +"\t페이지 : "+ b.getPage());
		}
		
//		for(int i=0; i<list2.size(); i++) {		// DB에선 Setter로 저장
//		Book b = list2.get(i);
//		System.out.println("책이름 : " + b.getTitle()+"\t책저자 : " + b.getAuthor() +"\t페이지 : "+ b.getPage());
//	}
		
		
		
		List<Book> list = new ArrayList<>();
		list.add(new Book("자바의 정석", "남궁성", 100));
		list.add(new Book("JSP", "김민철", 100));
		list.add(new Book("이것이 자바다", "이자바", 140));
		list.add(new Book("궁금증", "호기심", 150));
		
		
//		for(Book b : list) {
//			System.out.println(b.getTitle()+", " + b.getAuthor() +", "+ b.getPage());
//		}
		
//		Iterator<Book> it = list.iterator();
//		while(it.hasNext()) {
//			Book b = it.next();
//			System.out.println(b.getTitle() + ", " + b.getAuthor() + ", " + b.getPage()); 
//		}
		
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getTitle() + ", "  + list.get(i).getAuthor() + ", " + list.get(i).getPage());
//		}
		
	}

}
