package workshop09;

public class CharTest {

	public static void main(String[] args) {
		String str = args[0];
		str = str.toUpperCase();
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
