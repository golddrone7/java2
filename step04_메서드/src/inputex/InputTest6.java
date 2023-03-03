package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  BufferedReader를 이용하여 입력 받은 후 출력하세요
 *  사원번호를 입력하세요 : 102
 *  사원이름을 입력하세요 : 이순신
 *  부서코드를 입력하세요 : B
 *  입사성적을 입력하세요 : 90.54

--출력 결과
사원번호 : 102
사원이름 : 이순신
부서코드 : B
입사성적 : 90.54

출력문은 println(), 입사성적은 소수점 둘째자리까지 출력(printf)
*/
public class InputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dNo;
		String dName;
		char dCode;
		double dScore;
		
		System.out.print("사원번호를 입력하세요 : ");
		dNo = Integer.parseInt(br.readLine());
		System.out.print("사원이름을 입력하세요 : ");
		dName = br.readLine();
		System.out.print("부서코드를 입력하세요 : ");
		dCode = br.readLine().charAt(0);
		System.out.print("입사성적을 입력하세요 : ");
		dScore = Double.parseDouble(br.readLine());
		
		System.out.println("사원번호 : "+dNo+"\r\n"
				+ "사원이름 : "+dName+"\r\n"
				+ "부서코드 : "+dCode);
		System.out.printf("입사성적 : %.2f\n", dScore);
		
	}
}
