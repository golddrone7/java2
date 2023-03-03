package step01_기초;

// 분홍색 : 클래스 이름
// 클래스 이름과 파일 이름은 같아야한다.
// 자바는 클래스가 많으면 package로 묶음
/* System.out.printf("메시지 or 제어문자", 변수1, 변수2 ....)
 * ** 제어문자 **
 * %s String
 * %d int 정수, char 문자
 * %c char 
 * %f double, float 실수값들..
*/
public class DataType2 {
	public static void main(String[] args) {
		String name = "이순신";
		String dept = "개발부";
		char gender = 'M';
		double score=85.3; // 입력한 값은 정확히 나옴, 6자리는 어느정도
		float tall = 183.4f;
		int age = 25;
		char A = 'A';
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("부서 : %s\n", dept);
		System.out.printf("성별 : %c\n", gender);
		System.out.printf("점수 : %.2f점\n", score);  // 가장 많이 사용하는 방식
		System.out.printf("점수 : %10.1f점\n", score);  // 자리 값을 10개사용
		System.out.printf("점수 : %-10.1f점\n", score); // - 왼쪽 정렬, +오른쪽 정렬
		System.out.printf("신장 : %.2fcm\n", tall);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("나이 : %10d\n", age);
		System.out.printf("나이 : %-10d\n", age);
		//%s 제어문자 or escape문자 or 서식문자
//		System.out.println("이름 : "+ name);
//		System.out.println("부서 : "+ dept);		
	}
}
