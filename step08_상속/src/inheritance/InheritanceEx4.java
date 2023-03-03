package inheritance;

class Branch {
	public Branch() {
		System.out.println("Branch default constructor"); // 5
	}

	public Branch(String str) {
		this(); // 4
		System.out.println(str + " Branch constructor"); // 6
	}

}

class Leaf extends Branch {
	public Leaf() {
		super("마바사"); // 3
		System.out.println("Leaf default constructor"); // 7
	}

	public Leaf(String str, int n) {
		this(); // 2
		System.out.println(str + " " + n + "Leaf constructor"); // 8
	}
}

public class InheritanceEx4 {
	public static void main(String[] args) {
		new Leaf("가나다", 3); // 1 9
	}
}

// -------------------------------------------------- [2번쨰]

//class Branch{
//	public Branch() {
//		System.out.println("Branch default constructor");	// 4
//	}
//	public Branch(String str) {
//		this();	//3 
//		System.out.println(str + " Branch constructor"); // 5
//	}
//
//}
//
//class Leaf extends Branch{
//	public Leaf(String str) {
//		super(str); // 부모클래스 매개변수 1개인 생성자 호출	//2
//		System.out.println(str + "Leaf constructor"); // 6
//	}
//	
//}
//
//
//
//
//
//public class InheritanceEx4 {
//
//	public static void main(String[] args) {
//		Leaf leaf = new Leaf("Hi~~"); // 1
//	
//	}
//
//}

// ------------------------------------------------------------------ [1번째]

//class Branch{
//	public Branch() {
//		System.out.println("Branch default constructor");	// 4
//	}
//	public Branch(String str) {
//		this();	//3 
//		System.out.println(str + " Branch constructor"); // 5
//	}
//
//}
//
//class Leaf extends Branch{
//	public Leaf() {
//		super("Hi~"); // 부모클래스 매개변수 1개인 생성자 호출	//2
//		System.out.println("Leaf default constructor"); // 6
//	}
//	
//}
//
//
//public class InheritanceEx4 {
//
//	public static void main(String[] args) {
//		Leaf leaf = new Leaf(); // 1
//	
//	}
//
//}
