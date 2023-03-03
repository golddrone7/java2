package inheritance;

class SuperEx{
	public void show() {
		System.out.println("show1");
	}
}

class SubEx extends SuperEx{
	public void show() {
		super.show();
		System.out.println("show2");
	}
}

public class InheritanceEx2 {
	public static void main(String[] args) {
		SubEx sub = new SubEx();
		sub.show();
	}
}
