package workshop12;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("LGCNS");
		sb = sb.append("er");
		String str = sb.toString().substring(0, 2) + sb.toString().toLowerCase().substring(2);
		System.out.println(str);
	}

}
