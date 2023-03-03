package stringex;

public class StringEx {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = " programming";
		
		//0123456789012345
		//java programming
//		System.out.println(s1+s2);
		String s3 = s1.concat(s2); // concat 연결하다
		String s4 = s3.substring(5, 12); // 12는 익스클루시브 포함되지 않음
		String s5 = s3.substring(5);
		String s6 = s3.toUpperCase();
		String s7 = s3.toLowerCase();
		char s = s3.charAt(5);
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s);
		
//		------------------------------
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = str2;	
		System.out.println(str1==str2);	// true
		System.out.println(str1==str3);	// true
		
		String str4 = new String("hello");
		String str5 = new String("hello");
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3)); //true
		System.out.println(str4==str5); // false
		System.out.println(str4.equals(str5)); // true
		// 데이터를 비교하는 것은 equals 메소드를 사용
		// 객체의 값에 대한 비교
	}
}
