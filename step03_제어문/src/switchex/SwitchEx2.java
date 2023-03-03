package switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문제.
 * 숫자를 입력하세요 : 5
 * 
 * 5는 홀수입니다
*/
public class SwitchEx2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력
		int num;
		System.out.print("숫자를 입력하세요 : ");
		num = Integer.parseInt(br.readLine()); 
		//계산, 결과출력
		// 스위치 문
		switch(num%2) {
			case 0:
				System.out.println(num+"는 짝수입니다.");
				break;
			case 1:
				System.out.println(num+"는 홀수입니다.");
				break; 
			default:
				System.out.println("잘못된 입력값입니다.");
				break; // default는 break 선언안해도 처리 가능(선택사항)
		}
	}
}
