package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제8] 값을 입력받아 0보다 작거나 100보다 크면 "입력오류!!"  출력
(if문과 ||연산자를 이용하시오)

점수입력하시오 : 120
입력오류!!

점수입력하시오 : 55
입력된값 : 55
*/

public class Java8 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수입력하시오: ");
		int num = Integer.parseInt(br.readLine());
		
		if(num < 0 || 100 < num) {
			System.out.println("입력오류!!");
			System.exit(0);
		}
		System.out.println("입력된값 : " + num);
		
	}
}
