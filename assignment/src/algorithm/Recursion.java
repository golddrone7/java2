package algorithm;

public class Recursion {

	public static void recur(int x) {
		if(x==0) return;
		else {
			recur(x-1);
			System.out.print(x + " ");
		}
	}

	
	public static void main(String[] args) {
		recur(5);
	}

}
