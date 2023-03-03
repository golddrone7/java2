package study;

public class BookExample {
	public static void main(String[] args) {
		Book b = new Novel("메타버스 소설", "출판사(IT)");
		Book c = new SF("메타버스", "SF출판사");
		if(b instanceof Novel)
			b.print();
		if(c instanceof SF)
			c.print();
		
		
	}
}
