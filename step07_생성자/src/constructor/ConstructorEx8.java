package constructor;


public class ConstructorEx8 {
	public static void main(String[] args) {
		//Book book = new Book("자바의 정석", "남궁성", 500);
		Book book2 = new Book();
		book2.setAuthor("김자바");
		book2.setPage(150);
		book2.setTitle("자바의정석");
//		System.out.println(book2.toString());
//		// 생성자에 jsp 무조건따라하기, 이jp, 200 을 대입 후 getter를 이용하여 출력
//		// 책이름 : jsp무조건따라하기
//		Book book1 = new Book("jsp무조건따라하기", "이jp", 200);
//		System.out.println("책이름 : " + book1.getTitle());
//		System.out.println("책저자 : " + book1.getAuthor());
//		System.out.println("페이지 : " + book1.getPage());
//		System.out.println();
//		Book[] book = new Book[5];
//		book[0] = new Book("책이름1", "책저자1", 100);
//		book[1] = new Book("책이름2", "책저자2", 200);
//		book[2] = new Book("책이름3", "책저자3", 300);
//		book[3] = new Book("책이름4", "책저자4", 400);
//		book[4] = new Book("책이름5", "책저자5", 500);
//		/*			
//		 * User ob1 = new User("둘리", "강남구");
//		   ob[0] = ob1;	
//		*/
//		
//		
//		for(Book be : book) {
//			System.out.println("책이름 : " + be.getTitle());
//			System.out.println("책저자 : " + be.getAuthor());
//			System.out.println("페이지 : " + be.getPage());
//			System.out.println();
//		}
	}

}
