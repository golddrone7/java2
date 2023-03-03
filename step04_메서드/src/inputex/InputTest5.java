package inputex;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* eno:101, ename:홍길동, dept='A', score:89.5를 대입
   printf()를 사용하여 출력하세요
   --출력 결과
   사원번호 : 101
   사원이름 : 홍길동
   부서코드 : A
   입사성적 : 89.5
*/
public class InputTest5 {
	public static void main(String[] args) {
		int eno = 101;
		String ename = "홍길동";
		char dept = 'A';
		double score = 89.5;
		System.out.printf("사원번호 : %d\n"
				+ "사원이름 : %s\n"
				+ "부서코드 : %c\n"
				+ "입사성적 : %.1f\n", eno, ename, dept, score);
	}
}
