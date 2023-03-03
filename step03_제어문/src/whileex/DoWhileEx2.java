package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문제. do-while을 이용하여 반복처리를 하세요
 * 
 * 다시 실행할까요?(y/Y) : y
 * 다시 실행할까요?(y/Y) : Y
 * 다시 실행할까요?(y/Y) : n
 * 
 * ***** 수고하셨습니다 *****


*/

public class DoWhileEx2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char repeat;
		
		do {
			System.out.print("다시 실행할까요?(y/Y) : ");
			try {
				repeat = br.readLine().charAt(0); }
			catch(Exception e) {
				repeat = 'y';
			}
		} while (repeat == 'y' || repeat == 'Y');

		System.out.println("***** 수고하셨습니다 *****");

	}
}
