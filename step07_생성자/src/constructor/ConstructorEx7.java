package constructor;

public class ConstructorEx7 {
	public static void main(String[] args) {
		Member mb = new Member();
		mb.view();
		
		Member mb2 = new Member("가나다", 22);
		mb2.view(); 
		
		/*
			12345
			12345
			12345
			12345
			12345
		*/
	}
}
