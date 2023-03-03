package study;

class ClassName {
	
	private String element;	// 제네릭 타입 변수
	
	void set(String element) {	// 제네릭 파라미터 메소드
		this.element = element;
	}
	
	String get() {	// 제네릭 타입 반환 메소드
		return element;
	}
	
}
//class ClassName<new String> {
//	
//	private String element;	// 제네릭 타입 변수
//	
//	void set(String element) {	// 제네릭 파라미터 메소드
//		this.element = element;
//	}
//	
//	String get() {	// 제네릭 타입 반환 메소드
//		return element;
//	}
//	
//}
// 



class Main2 {
	public static void main(String[] args) {
		
		ClassName a = new ClassName();
		//ClassName<Integer> b = new ClassName<Integer>();
		
		a.set("10");

	
		System.out.println("a data : " + a.get());
		// 반환된 변수의 타입 출력 
		System.out.println("a E Type : " + a.get().getClass().getName());
		
		System.out.println();
//		System.out.println("b data : " + b.get());
//		// 반환된 변수의 타입 출력 
//		System.out.println("b E Type : " + b.get().getClass().getName());
//		
	}
}