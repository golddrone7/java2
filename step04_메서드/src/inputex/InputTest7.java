package inputex;
/*
 *  Argument를 이용하여 입력 받은 후 출력하세요
 *  
 *  $java InputTest7 103 뽀로로 C 75.3
 *  사원번호를 입력하세요 : 103
 *  사원이름을 입력하세요 : 뽀로로
 *  부서코드를 입력하세요 : C
 *  입사성적을 입력하세요 : 75.3
 *  
 *  출력문은 printf()를 1회 사용하여 전체를 출력하세요
*/
public class InputTest7 {

	public static void main(String[] args) {
		
		int dNo = Integer.parseInt(args[0]);
		String dName = args[1];
		char dCode = args[2].charAt(0);
		double dScore = Double.parseDouble(args[3]);
		
		System.out.printf("사원번호를 입력하세요 : %d\n"
				+ "사원이름을 입력하세요 : %s\n"
				+ "부서코드를 입력하세요 : %c\n"
				+ "입사성적을 입력하세요 : %.1f\n", dNo, dName, dCode, dScore);
		
		double f = 71.3213145;
		System.out.println(String.format("%.2f", f));
		System.out.printf("%.2f ", f);
	}
}
