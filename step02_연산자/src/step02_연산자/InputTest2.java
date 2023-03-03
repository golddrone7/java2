package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문제
 * 
 * A값을 입력하세요 : 15
 * B값을 입력하세요 : 10
 * 
 * 15 + 10 = 25
*/

public class InputTest2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		//InputStream is = System.in;
//		InputStreamReader isr = new   InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr); // 속도 향상 보조 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double A, B;
		System.out.print("A의값을 입력하세요 : "); // ctrl + 1 예외처리
		A = Double.parseDouble(br.readLine());
		System.out.print("B의값을 입력하세요 : ");
		B = Double.parseDouble(br.readLine());
		System.out.printf("%.1f + %.1f = %.1f", A, B, A + B);
	}
}
