package algorithm;



class Node2{
	int a;
	int b;
	public Node2() {
		System.out.println("Node2 default method");
	}
}



public class ArrayStack {
	
	public class Node{
		int a;
		int b;
		public Node() {
			System.out.println("Node default method");
		}
	}
	
	public ArrayStack(){
		System.out.println("ArrayStack default method");
	}
	
	public static void main(String[] args) {
		// new 연산자 : 객체를 Heap이라는 메모리 영역에 메모리 공간을 할당.
		// ArrayStack() : 메모리주소를 반환한 후 생성자 실행.
		new ArrayStack(); 
		//new Node();
		new Node2();
	}

}
