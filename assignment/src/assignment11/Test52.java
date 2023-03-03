package assignment11;

/*
[문제 52] 문자열변수에 "IT ELITE" 를 대입한후 String클래스의 메서드를 이용하여
              다음과 같이 출력하시오

(1) Test52클래스 main()에서 
     String str="IT ELITE";
     //나머지를 완성하시오

[결과화면]
L   T
it elite
IT
ELITE
iT ELiTE
*/
public class Test52 {

	public static void main(String[] args) {
		String str="IT ELITE";
		
		System.out.println(str.charAt(4) + "   " + str.charAt(6));
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(0, 2));
		System.out.println(str.substring(3));
		System.out.println(str.replaceAll("I", "i"));
	}
}
