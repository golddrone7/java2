package study;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList node = new LinkedList(10);
		node.addAtTail(20);
		node.addAtTail(30);
		node.addAtTail(40);
		node.addAtTail(50);
		node.addAtTail(60);
		node.addAtTail(70);
		node.addAtTail(80);
		node.addAtTail(90);
		node.addAtTail(100);
		
		
		System.out.println("node.getSize() = "+node.getSize());
		

		node.printList();
		

	}

}
