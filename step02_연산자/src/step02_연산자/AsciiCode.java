package step02_연산자;
/* ASCII(7bit) 미국 정보 교환용 표준 코드 0~127개의 값을 가지고 문자열을 매핑 시킴
 * A 65 -- 1000001
 * a 97 
 * \n 13
*/
public class AsciiCode {
	public static void main(String[] args) {
		System.out.println('A' + " :" + (int) 'A');
		System.out.println('Z' + " :" + (int) 'Z');
		System.out.println('a' + " :" + (int) 'a');
		System.out.println('z' + " :" + (int) 'z');
		System.out.println("\\n" + " :" + (int) '\n');
		System.out.println('가' + " :" + (int) '가');
		System.out.println(65 + " :" + (char) 65);
		System.out.println(97 + " :" + (char) 97);
		System.out.println("--------------------------------------------");
		System.out.println('A' + 1); // char + int ==> int
		System.out.println((char)('A'+1)); // 형변환을 통해 (char)(char+int) ==> char
		System.out.println("A" + 1 ); // String + int ==> String 연결
		// ctrl+shift+x (드래그 영역)대문자 변환
		// ctrl+shift+y (드래그 영역)소문자 변환
		System.out.println('a'-32); // 65 
		System.out.println((char)('a'-32)); // A		
		System.out.println('a' + 'b'); // char + char ==> int 
		System.out.println((char)('a'+'b')); // ??Ã
		System.out.println("♥º＝∧―㈘"); 
		// KS 한글완성형(가,나,다)
		// KSSM 한글조합형 ex)뷁 시스템 OS, 소프트웨어, 미국 영문판
	}
}
