package workshop12;

import java.util.StringTokenizer;

public class StringTest01 {
	public static void main(String[] args) {
		String str = "I am second to none";
		StringTokenizer st = new StringTokenizer(str, " ");
		String str1="";
		while(st.hasMoreTokens()) {
			str1+=st.nextToken();
		}
		for(int i=0; i<str1.length(); i++) {
			System.out.print(str1.charAt(i) + " ");
		}
		System.out.println("문자개수: " + str1.length());
		
		char[] c = new char[str.length()];
		int count=1;
		for(int i=0; i<str.length(); i++) {
			c[i] = str.charAt(i);
			System.out.print(c[i]);
			if(c[i]==' ') {
				count++;
			}
		}
		System.out.println(" 단어개수: " + count);
	}
}
